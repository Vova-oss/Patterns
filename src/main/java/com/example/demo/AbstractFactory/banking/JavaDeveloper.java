package com.example.demo.AbstractFactory.banking;

import com.example.demo.AbstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void developTheProject() {
        System.out.println("Develop java code for bank");
    }
}
