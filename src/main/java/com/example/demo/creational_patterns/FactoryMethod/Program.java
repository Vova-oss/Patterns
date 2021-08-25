package com.example.demo.creational_patterns.FactoryMethod;

import com.example.demo.creational_patterns.FactoryMethod.Factories.Factory;
import com.example.demo.creational_patterns.FactoryMethod.Factories.JavaDeveloperFactory;
import com.example.demo.creational_patterns.FactoryMethod.Objects.Developer;

/**
 * Класс - Клиент
 */
public class Program {

    public static void main(String[] args) {

        //Можем выбрать фабрику, которая далее будет создавать объекты
//        Factory factory = new CSharpDeveloperFactory();
        Factory factory = new JavaDeveloperFactory();

        Developer developer = factory.createDeveloper();
        developer.develop();

    }

}
