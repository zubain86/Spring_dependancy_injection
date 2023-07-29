package com.example.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
//        System.out.println("Hello World.....This is the first spring project");
//        System.out.println("Hello world spring project is all set to use");
//        Alien a1 = context.getBean(Alien.class);
//        a1.show();
//        Alien a2 = context.getBean(Alien.class);
//        a2.show();
        // Object is created only once when only component is being used
        // as spring follows singleton design pattern

        // Let's understand the concept of scope annotation
        // Scope annotation creates object when demanded
        // Now in this example two objects will be created

      Alien a  = context.getBean(Alien.class);
      a.show();


    }

}
