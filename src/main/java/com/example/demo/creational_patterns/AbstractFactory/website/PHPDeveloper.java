package com.example.demo.creational_patterns.AbstractFactory.website;

import com.example.demo.creational_patterns.AbstractFactory.Developer;

public class PHPDeveloper implements Developer {
    @Override
    public void developTheProject() {
        System.out.println("Develop php code for website");
    }
}
