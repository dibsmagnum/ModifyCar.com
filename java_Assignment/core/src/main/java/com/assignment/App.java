package com.assignment;

import com.assignment.carClass.Car;
import com.assignment.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) throws Exception
    {
        try(AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext(AppConfig.class)){
        Car car=(Car) config.getBean(Car.class);
        car.getLogin();
        config.close();
        }
        catch(Exception e){
            // System.out.println("The Error comes as "+e.getMessage());
        }
    }
}
