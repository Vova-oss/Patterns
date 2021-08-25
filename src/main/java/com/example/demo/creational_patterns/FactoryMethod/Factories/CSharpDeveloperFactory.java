package com.example.demo.creational_patterns.FactoryMethod.Factories;

import com.example.demo.creational_patterns.FactoryMethod.Objects.CSharpDeveloper;
import com.example.demo.creational_patterns.FactoryMethod.Objects.Developer;

public class CSharpDeveloperFactory implements Factory{
    @Override
    public Developer createDeveloper() {
        return new CSharpDeveloper();
    }
}
