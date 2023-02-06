package com.example.apiusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiUsersApplication.class, args);
    }

}
