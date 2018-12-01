package com.hendisantika.graphql.springbootgraphqlsample2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-graphql-sample2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-01
 * Time: 09:22
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Movie {
    @Id
    private String movieId;
    private String movieName;
    private String releaseDate;
    private String[] actors;
    private String director;
    private String producer;

    public Movie() {
        super();
    }
}
