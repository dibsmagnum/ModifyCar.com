package com.assignment.config;

import com.assignment.carClass.Car;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.assignment.carClass","com.assignment.config","com.assignment.carClass.modifyCar","com.assignment.CarModification"})
public class AppConfig {
    @Bean
    public Car car(){
        return new Car();
    }
}
