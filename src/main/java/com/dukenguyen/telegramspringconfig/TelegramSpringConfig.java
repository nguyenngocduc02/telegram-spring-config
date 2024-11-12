package com.dukenguyen.telegramspringconfig;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication(scanBasePackages = "com.dukenguyen")
public class TelegramSpringConfig {
    public static void main(String[] args) {
        SpringApplication.run(TelegramSpringConfig.class, args);
    }
}
