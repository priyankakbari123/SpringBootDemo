package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    //Help to find Laptop bean class in spring container
    @Autowired
    private Laptop laptop;
    void show(){
        System.out.println("From Show of Alien");
        System.out.println(laptop.toString());
    }
}
