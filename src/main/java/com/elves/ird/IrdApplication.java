package com.elves.ird;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class IrdApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(IrdApplication.class, args);
    }
}