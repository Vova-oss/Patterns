package com.example.demo.creational_patterns.AbstractFactory.website;

import com.example.demo.creational_patterns.AbstractFactory.AbstractFactory;
import com.example.demo.creational_patterns.AbstractFactory.Developer;
import com.example.demo.creational_patterns.AbstractFactory.ProjectManager;
import com.example.demo.creational_patterns.AbstractFactory.Tester;

// Фабрика конкретных объектов, связанных между собой
public class WebsiteFactory implements AbstractFactory {
    @Override
    public Developer createDeveloper() {
        return new PHPDeveloper();
    }

    @Override
    public ProjectManager createProjectManager() {
        return new WebsiteManager();
    }

    @Override
    public Tester createTester() {
        return new WebsiteTester();
    }
}
