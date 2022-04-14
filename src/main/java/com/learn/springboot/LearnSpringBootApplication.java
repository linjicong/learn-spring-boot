package com.learn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(LearnSpringBootApplication.class);
        springApplication.addListeners(new MyApplicationListener());
        springApplication.run(args);
    }

}
