/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soccer;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author sammerm
 */
public class DataSource {
@ConfigurationProperties(prefix = "datasource.mysql")
@Bean
@Primary
public javax.sql.DataSource dataSource() {
    return DataSourceBuilder
        .create()
        .build();
    }
}