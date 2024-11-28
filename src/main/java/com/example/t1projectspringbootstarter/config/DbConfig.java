package com.example.t1projectspringbootstarter.config;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Import(StarterEntityRegistrar.class)
@ConditionalOnClass(DataSource.class)
@ConditionalOnProperty(value = "t1.aop.error-log", havingValue = "true")
@AutoConfigureBefore({JpaRepositoriesAutoConfiguration.class, LiquibaseAutoConfiguration.class})
@EnableJpaRepositories(basePackages = "com.example.t1projectspringbootstarter.repository")
public class DbConfig {
}