package com.primeton.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href='mailto:huzd@primeton.com'>虎振东</a>
 * @date 2017/5/16 09:56.
 */
@RestController
@SpringBootApplication
public class SampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }

    @GetMapping("/hello")
    public Object hello(String name) {
        return String.format("Hello %s !", name);
    }

}
