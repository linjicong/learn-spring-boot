package com.learn.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@MapperScan("com.learn.springboot.dao.mapper")
public class LearnSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(LearnSpringBootApplication.class);
        springApplication.addListeners(new MyApplicationListener());
        springApplication.addInitializers(new MyApplicationContextInitializer());
        springApplication.run(args);
    }

}
