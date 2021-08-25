package com.example.demo.creational_patterns.AbstractFactory;

import com.example.demo.creational_patterns.AbstractFactory.website.WebsiteFactory;

public class Client {
    public static void main(String[] args) {

        // Выбираем любую реализацию абстракной фабрики
        AbstractFactory abstractFactory = new WebsiteFactory();
//        AbstractFactory abstractFactory = new BankingFactory();

        Developer developer = abstractFactory.createDeveloper();
        Tester tester = abstractFactory.createTester();
        ProjectManager projectManager = abstractFactory.createProjectManager();

        developer.developTheProject();
        tester.testTheProject();
        projectManager.manageTheProject();
    }
}
