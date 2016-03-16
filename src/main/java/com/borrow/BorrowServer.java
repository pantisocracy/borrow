package com.borrow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by lbc on 16/3/16.
 */
@SpringBootApplication
@EnableScheduling
public class BorrowServer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BorrowServer.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BorrowServer.class, args);
    }
}
