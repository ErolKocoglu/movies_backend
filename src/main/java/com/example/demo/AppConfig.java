package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    @Primary
    public String name1() {
        System.out.println("name1 run");
        return "asd";
    }

    @Bean
    public String name2() {
        System.out.println("name2 run");
        return "qwe";
    }


    @Bean
    public static Entity makeEntity(){
        return new Entity("bean");
    }
}
