package com.ironhack.filmplus;

import com.ironhack.filmplus.Utils.Welcome;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class FilmplusApplication {

    public static void main(String[] args) {
      //  SpringApplication.run(FilmplusApplication.class, args);

        com.ironhack.filmplus.Utils.Banners.cleanScreen();
        com.ironhack.filmplus.Utils.Banners.logo();
        System.out.println("Welcome to Film++! ♪");
        Welcome.login();
    }


}

//    public static void main(String[] args) {
//        SpringApplication.run(FilmplusApplication.class, args);
//        Welcome.login();
//    }
//    @LoadBalanced
//
//    }




