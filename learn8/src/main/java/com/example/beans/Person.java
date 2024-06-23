package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Lucy";
    /*@Autowired(required = false)*/ // required false make the autowired to be optional so when the bean is not there, there'll be no NoSuchBean error
    private final Vehicle vehicle;
    @Autowired
    public Person(Vehicle vehicle){
        System.out.println("Person bean created by Spring");
        this.vehicle = vehicle;
    }

    /*
    The @Autowired annotation marks on a field, constructor, Setter method
    is used to auto-wire the beans that is ‘injecting beans'(Objects) at runtime
    by Spring Dependency Injection mechanism
    * */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
