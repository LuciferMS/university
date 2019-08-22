package com.university.sso.service.service;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Elliot
 */
@EnableDubbo
@SpringBootApplication
public class SsoServiceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoServiceServiceApplication.class, args);
    }

}
