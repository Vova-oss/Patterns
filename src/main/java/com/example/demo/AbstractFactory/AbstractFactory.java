package com.example.demo.AbstractFactory;

public interface AbstractFactory {

    Developer createDeveloper();
    ProjectManager createProjectManager();
    Tester createTester();

}
