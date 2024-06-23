package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Learn4 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle v = new Vehicle();
        v.setName("ferrari");
        Supplier<Vehicle> ferrariVehicleSupplier = () -> v;

        Supplier<Vehicle> audiVehicleSupplier = () -> {
            Vehicle vehicle = new Vehicle();
            vehicle.setName("Audi");
            return vehicle;
        };

        int random = (int) (Math.random() * 10 + 1);
        System.out.println("Random num: " + random);
        if((random%2)==0){
            context.registerBean("ferrari", Vehicle.class, ferrariVehicleSupplier);
        }else{
            context.registerBean("audi", Vehicle.class, audiVehicleSupplier);
        }

        try{
            System.out.println("Programming Vehicle name from Spring Context is: " + context.getBean("ferrari", Vehicle.class).getName());
        }catch (NoSuchBeanDefinitionException exception){
            System.out.println("Error while creating Ferrari vehicle.");
        }

        try{
            System.out.println("Programming Vehicle name from Spring Context is : " + context.getBean("audi", Vehicle.class).getName());
        }catch (NoSuchBeanDefinitionException exception){
            System.out.println("Error while creating Audi vehicle.");
        }
    }
}
