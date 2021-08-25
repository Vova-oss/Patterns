package com.example.demo.creational_patterns.AbstractFactory.banking;

import com.example.demo.creational_patterns.AbstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageTheProject() {
        System.out.println("Manage the bank");
    }
}
