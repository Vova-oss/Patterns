package com.example.demo.structural_patterns.Bridge.SecondAttr;

import com.example.demo.structural_patterns.Bridge.FirstAttr.Developer;

public class CompanySystem extends Program{

    public CompanySystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Creating company system....");
        developer.developSomething();
    }
}
