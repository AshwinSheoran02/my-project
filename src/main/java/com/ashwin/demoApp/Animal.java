package com.ashwin.demoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Animal  {
    @Autowired
    private Species zoo;

    public Animal(Zoo zoo){
        this.zoo = zoo;
    }

    public void eats(){
        System.out.println("This Animal is Eating");
        zoo.area();

    }
}
