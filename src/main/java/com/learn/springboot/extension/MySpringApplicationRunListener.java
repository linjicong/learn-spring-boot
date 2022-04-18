package com.learn.springboot.extension;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Slf4j
public class MySpringApplicationRunListener implements SpringApplicationRunListener {

    private final SpringApplication springApplication;
    private final String[] args;
    public MySpringApplicationRunListener(SpringApplication springApplication, String[] args) {
        this.springApplication=springApplication;
        this.args=args;
    }
    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        log.info("MySpringApplicationRunListener.starting()");
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        log.info("MySpringApplicationRunListener.environmentPrepared()");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        log.info("MySpringApplicationRunListener.contextPrepared()");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        log.info("MySpringApplicationRunListener.contextLoaded()");
    }

    @Override
    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
        log.info("MySpringApplicationRunListener.started()");
    }

    @Override
    public void ready(ConfigurableApplicationContext context, Duration timeTaken) {
        log.info("MySpringApplicationRunListener.ready()");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        log.info("MySpringApplicationRunListener.failed()");
    }
}
