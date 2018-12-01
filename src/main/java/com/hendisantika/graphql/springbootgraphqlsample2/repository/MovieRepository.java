package com.hendisantika.graphql.springbootgraphqlsample2.repository;

import com.hendisantika.graphql.springbootgraphqlsample2.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-graphql-sample2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-01
 * Time: 09:24
 * To change this template use File | Settings | File Templates.
 */
public interface MovieRepository extends JpaRepository<Movie, String> {
}
