package com.hendisantika.graphql.springbootgraphqlsample2.datafetcher;

import com.hendisantika.graphql.springbootgraphqlsample2.entity.Movie;
import com.hendisantika.graphql.springbootgraphqlsample2.repository.MovieRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-graphql-sample2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-01
 * Time: 09:27
 * To change this template use File | Settings | File Templates.
 */
@Component
public class MovieDataFetcher implements DataFetcher<Movie> {
    @Autowired
    private MovieRepository repository;

    @Override
    public Movie get(DataFetchingEnvironment environment) {
        String movieId = environment.getArgument("id");
        return repository.findOne(movieId);
    }

}