package com.photoapp.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class GlobalFiltersConfiguration {
    Logger logger = LoggerFactory.getLogger(GlobalFiltersConfiguration.class);

    @Bean
    public GlobalFilter secondPreFilter() {
        return ((exchange, chain) -> {
           logger.info("My second Pre-Filter is executed...");
           return chain.filter(exchange).then(Mono.fromRunnable(() -> {
               logger.info("My second Post-Filter was executed...");
           }));
        });
    }

    @Bean
    public GlobalFilter thirdPreFilter() {
        return ((exchange, chain) -> {
            logger.info("My third Pre-Filter is executed...");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("My third Post-Filter was executed...");
            }));
        });
    }

    @Bean
    public GlobalFilter fourthPreFilter() {
        return ((exchange, chain) -> {
            logger.info("My fourth Pre-Filter is executed...");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("My fourth Post-Filter was executed...");
            }));
        });
    }
}
