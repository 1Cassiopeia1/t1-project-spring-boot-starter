package com.example.t1projectspringbootstarter.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.converter.RecordMessageConverter;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

@AutoConfiguration
public class CommonKafkaConfig {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "t1.kafka.enabled", havingValue = "true", matchIfMissing = true)
    public RecordMessageConverter recordMessageConverter(ObjectMapper objectMapper) {
        return new StringJsonMessageConverter(objectMapper);
    }
}
