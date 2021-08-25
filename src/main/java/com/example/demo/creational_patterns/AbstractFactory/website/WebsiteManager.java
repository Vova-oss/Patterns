package com.example.demo.creational_patterns.AbstractFactory.website;

import com.example.demo.creational_patterns.AbstractFactory.ProjectManager;

public class WebsiteManager implements ProjectManager {
    @Override
    public void manageTheProject() {
        System.out.println("Manage the actions in website");
    }
}
