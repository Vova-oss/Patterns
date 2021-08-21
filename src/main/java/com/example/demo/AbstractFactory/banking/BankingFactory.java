package com.example.demo.AbstractFactory.banking;

import com.example.demo.AbstractFactory.AbstractFactory;
import com.example.demo.AbstractFactory.Developer;
import com.example.demo.AbstractFactory.ProjectManager;
import com.example.demo.AbstractFactory.Tester;

// Фабрика конкретных объектов, связанных между собой
public class BankingFactory implements AbstractFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ProjectManager createProjectManager() {
        return new BankingPM();
    }

    @Override
    public Tester createTester() {
        return new BankingTester();
    }
}
