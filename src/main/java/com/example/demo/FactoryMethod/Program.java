package com.example.demo.FactoryMethod;

import com.example.demo.FactoryMethod.Factories.CSharpDeveloperFactory;
import com.example.demo.FactoryMethod.Factories.Factory;
import com.example.demo.FactoryMethod.Factories.JavaDeveloperFactory;
import com.example.demo.FactoryMethod.Objects.Developer;

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
