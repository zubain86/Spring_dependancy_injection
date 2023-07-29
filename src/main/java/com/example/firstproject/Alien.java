package com.example.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// This component annotation creates object in spring container
//@Scope(value = "prototype")
// This scope annotation creates object only when demanded
public class Alien {
    private String name;
    private String id;
    @Autowired
    @Qualifier("lap1")
    // This searches for a dependant object in spring container
    private Laptop laptop;

    public Laptop getObj() {
        return laptop;
    }
    public void setObj(Laptop laptop) {
        this.laptop = laptop;
    }

    Alien()
    {
        System.out.println("Object created");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void show()
    {
        System.out.println("Indicate that i am in show");
        laptop.compile();
    }

}
