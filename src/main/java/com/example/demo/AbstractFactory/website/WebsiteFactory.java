package com.example.demo.AbstractFactory.website;

import com.example.demo.AbstractFactory.AbstractFactory;
import com.example.demo.AbstractFactory.Developer;
import com.example.demo.AbstractFactory.ProjectManager;
import com.example.demo.AbstractFactory.Tester;

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
