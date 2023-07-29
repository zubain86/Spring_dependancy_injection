package com.example.firstproject;

import org.springframework.stereotype.Component;

@Component("lap1")// We can also pass properties in annotations. Here this annotation is used to change the object name in spring container
// Creates object in spring container
public class Laptop {
    String modelnumber;
    String brand;

    public String getModelnumber() {
        return modelnumber;
    }

    public void setModelnumber(String modelnumber) {
        this.modelnumber = modelnumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void compile()
    {
        System.out.println("Laptop is compiled successfully");
    }

}
