package com.example.demo.creational_patterns.AbstractFactory;

public interface AbstractFactory {

    Developer createDeveloper();
    ProjectManager createProjectManager();
    Tester createTester();

}
