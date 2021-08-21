package com.example.demo.AbstractFactory.banking;

import com.example.demo.AbstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageTheProject() {
        System.out.println("Manage the bank");
    }
}
