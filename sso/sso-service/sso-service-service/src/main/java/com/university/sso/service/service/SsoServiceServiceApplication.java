package com.university.sso.service.service;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Elliot
 */
@EnableDubbo
@SpringBootApplication
@ImportResource(value = "classpath*:application/application-context.xml")
public class SsoServiceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoServiceServiceApplication.class, args);
    }

}
