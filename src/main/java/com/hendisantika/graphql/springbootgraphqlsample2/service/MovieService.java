package com.hendisantika.graphql.springbootgraphqlsample2.service;

import com.hendisantika.graphql.springbootgraphqlsample2.entity.Movie;
import com.hendisantika.graphql.springbootgraphqlsample2.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-graphql-sample2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-01
 * Time: 09:25
 * To change this template use File | Settings | File Templates.
 */
@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;

    @PostConstruct
    public void initMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("M17TZ", "Tiger Zinda Hai",
                "22-12-2017", new String[]{"Salman Khan", "Katrina Kaif", "Sajjad Delfrooz", "Angad Bedi",
                "Kumud Mishra", "Nawab Shah", "Girish Karnad", "Paresh"},
                "Ali Abbas Zafar", "Yash Raj Films"));
        movies.add(new Movie("M17BTC", "Baahubali 2 The Conclusion", "28-04-2017",
                new String[]{"Prabhas", "Sudeep", "Anushka Shetty", "Rana Daggubati", "Tamannaah", "Satyaraj",
                        "Ramya Krishnan", "Nassar", "Shriya Saran", "Rohini"},
                "S.S.Rajamouli", "Shobu Yarlagadda and Prasad Devineni"));
        repository.save(movies);
    }

    public List<Movie> findAllMovies() {
        return repository.findAll();
    }

    public Movie findMovieById(String movieId) {
        return repository.findOne(movieId);
    }

}