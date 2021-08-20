package com.example.demo.FactoryMethod.Factories;

import com.example.demo.FactoryMethod.Objects.Developer;
import com.example.demo.FactoryMethod.Objects.JavaDeveloper;

public class JavaDeveloperFactory implements Factory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
