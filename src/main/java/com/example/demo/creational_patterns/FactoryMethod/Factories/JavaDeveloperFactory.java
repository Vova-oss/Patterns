package com.example.demo.creational_patterns.FactoryMethod.Factories;

import com.example.demo.creational_patterns.FactoryMethod.Objects.Developer;
import com.example.demo.creational_patterns.FactoryMethod.Objects.JavaDeveloper;

public class JavaDeveloperFactory implements Factory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
