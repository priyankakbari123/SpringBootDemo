package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public Laptop() {
        System.out.println("Laptop Object Created");
    }

    @Override
    public String toString() {
        return "Laptop{}";
    }
}
