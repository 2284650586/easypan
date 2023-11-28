package com.lxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@SpringBootApplication
@EnableScheduling
public class EasypanApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasypanApplication.class, args);
    }

}
