package com.example.springinactionproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringInActionProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringInActionProjectApplication.class, args);
    }

}
