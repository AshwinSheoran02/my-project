package com.ashwin.demoApp;

import org.springframework.stereotype.Component;

@Component
public class Zoo implements Species {

    public void area(){
        System.out.println("The zoo is in Delhi");
    }
}
