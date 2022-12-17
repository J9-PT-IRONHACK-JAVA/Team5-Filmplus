package com.ironhack.filmplus;

import com.ironhack.filmplus.Utils.Welcome;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
@Component
@RequiredArgsConstructor
public class FilmplusApplication implements CommandLineRunner {

    private final Welcome welcome;

    public static void main(String[] args) {
      SpringApplication.run(FilmplusApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        com.ironhack.filmplus.Utils.Banners.cleanScreen();
        com.ironhack.filmplus.Utils.Banners.logo();
        System.out.println("Welcome to Film++! ♪");
        welcome.login();
    }
}