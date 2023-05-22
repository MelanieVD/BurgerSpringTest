package org.example.config;

import org.example.register.Burger;
import org.example.register.Pain;
import org.example.register.Salade;
import org.example.register.Fromage;
import org.example.register.Steak;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Burger burger(){
        return new Burger(fromage(), pain(), salade(), steak());
    }

    @Bean
    public Fromage fromage(){
        return new Fromage();
    }

    @Bean
    public Salade salade(){
        return new Salade();
    }

    @Bean
    public Pain pain(){
        return new Pain();
    }

    @Bean
    public Steak steak(){
        return new Steak();
    }
}
