package com.onggia.identityserviceproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IdentityServiceProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdentityServiceProjectApplication.class, args);
    }

}
