package com.example.t1projectspringbootstarter.config;

import liquibase.integration.spring.SpringLiquibase;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@ConditionalOnClass(DataSource.class)
@ConditionalOnProperty(value = "t1.aop.error-log", havingValue = "true")
@AutoConfigureAfter(LiquibaseAutoConfiguration.class)
@RequiredArgsConstructor
public class LiquibaseConfig {

    private final DataSource dataSource;

    @Bean
    public SpringLiquibase springLiquibase() {

        SpringLiquibase springLiquibase = new SpringLiquibase();
        springLiquibase.setChangeLog("classpath:db/changelog/changelog-master.xml");
        springLiquibase.setDataSource(dataSource);
        springLiquibase.setDatabaseChangeLogTable("starter_databasechangelog");
        springLiquibase.setDatabaseChangeLogLockTable("starter_databasechangeloglock");

        return springLiquibase;
    }
}