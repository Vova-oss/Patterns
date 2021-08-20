package com.example.demo.FactoryMethod.Factories;

import com.example.demo.FactoryMethod.Objects.CSharpDeveloper;
import com.example.demo.FactoryMethod.Objects.Developer;

public class CSharpDeveloperFactory implements Factory{
    @Override
    public Developer createDeveloper() {
        return new CSharpDeveloper();
    }
}
