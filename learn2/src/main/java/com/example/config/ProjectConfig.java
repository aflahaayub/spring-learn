package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle1(){
        Vehicle v = new Vehicle();
        v.setName("Audi 8");
        return v;
    }

    @Bean
    Vehicle vehicle2(){
        Vehicle v = new Vehicle();
        v.setName("Honda");
        return v;
    }

    @Primary
    @Bean("kijangVehicle")
    Vehicle vehicle3(){
        Vehicle v = new Vehicle();
        v.setName("Kijang");
        return v;
    }

    @Bean(name="ferrarriVehicle")
    Vehicle vehicle4(){
        Vehicle v = new Vehicle();
        v.setName("Ferarri");
        return v;
    }

    @Bean
    String hello(){
        return "Hello World";
    }
    @Bean
    Integer number(){
        return 16;
    }
}
