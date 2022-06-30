package com.bobocode.springbootserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServerApplication.class, args);
    }

}
