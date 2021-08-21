package com.example.demo.AbstractFactory.website;

import com.example.demo.AbstractFactory.Developer;

public class PHPDeveloper implements Developer {
    @Override
    public void developTheProject() {
        System.out.println("Develop php code for website");
    }
}
