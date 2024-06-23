package com.example.main;

import com.example.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Learn5 {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle v = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is " + v.getName());
    }
}
