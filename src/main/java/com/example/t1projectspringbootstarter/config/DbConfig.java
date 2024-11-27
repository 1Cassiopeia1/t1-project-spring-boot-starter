package com.example.t1projectspringbootstarter.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@AutoConfiguration
@ConditionalOnProperty("spring.datasource.url")
@EntityScan("com.example.t1projectspringbootstarter")
@EnableJpaRepositories("com.example.t1projectspringbootstarter")
@ConditionalOnBean(DataSource.class)
public class DbConfig {
}