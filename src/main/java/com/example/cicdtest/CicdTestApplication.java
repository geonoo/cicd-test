package com.example.cicdtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({ @PropertySource("classpath:application-aws.properties") })
public class CicdTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdTestApplication.class, args);
    }

}
