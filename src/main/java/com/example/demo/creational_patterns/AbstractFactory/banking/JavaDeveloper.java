package com.example.demo.creational_patterns.AbstractFactory.banking;

import com.example.demo.creational_patterns.AbstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void developTheProject() {
        System.out.println("Develop java code for bank");
    }
}
