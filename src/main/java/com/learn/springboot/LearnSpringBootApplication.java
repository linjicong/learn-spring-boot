package com.learn.springboot;

import com.learn.springboot.extension.MyApplicationContextInitializer;
import com.learn.springboot.extension.MyApplicationListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
