package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    private final Entity entity;

    @Autowired
    public Service(Entity entity){
        System.out.println("Service constructor run");
        this.entity=entity;
    }

    public void serviceCall(){
        entity.greet();
    }
}
