package com.example.demo.AbstractFactory.website;

import com.example.demo.AbstractFactory.ProjectManager;

public class WebsiteManager implements ProjectManager {
    @Override
    public void manageTheProject() {
        System.out.println("Manage the actions in website");
    }
}
