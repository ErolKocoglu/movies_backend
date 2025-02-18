package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Entity {


    private String name;

    public void greet() {
        System.out.println("Hello from " + name);
    }


    public Entity( String name) {
        System.out.println("Entity constructor run, name: "+name);
        this.name = name;
    }

    /*public Entity(){
        System.out.println("empty constructor");
    }*/
}
