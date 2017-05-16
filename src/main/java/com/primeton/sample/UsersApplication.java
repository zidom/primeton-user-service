package com.primeton.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href='mailto:huzd@primeton.com'>虎振东</a>
 * @date 2017/5/16 09:56.
 */
@RestController
@SpringBootApplication
public class UsersApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(UsersApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(UsersApplication.class, args);
    }

    @GetMapping("/hello")
    public Object hello(String name) {
        return String.format("Hello %s !", name);
    }

}
