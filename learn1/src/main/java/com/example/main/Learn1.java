package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Learn1 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Vehicle vehicle1 = context.getBean("vehicle1", Vehicle.class);
//        Vehicle vehicle2 = context.getBean("vehicle2", Vehicle.class);
//        Vehicle vehicle3 = context.getBean("ferrarriVehicle", Vehicle.class);

        Vehicle vehicle1 = context.getBean(Vehicle.class);

        String hello = context.getBean("hello", String.class);
        Integer num = context.getBean(Integer.class);

        System.out.println("Bean vehicle1: " + vehicle1.getName());
//        System.out.println("Bean vehicle2: " + vehicle2.getName());
//        System.out.println("Bean vehicle3: " + vehicle3.getName());
        System.out.println("Bean hello: " + hello);
        System.out.println("Bean num: " + num);


    }
}
