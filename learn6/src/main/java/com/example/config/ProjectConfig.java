package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Vehicle vehicle(){
        Vehicle v = new Vehicle();
        v.setName("Audi");
        return v;
    }

    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle()); // wiring using method call
        return person;
    }
}
