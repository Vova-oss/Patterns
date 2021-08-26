package com.example.demo.structural_patterns.Bridge.SecondAttr;

import com.example.demo.structural_patterns.Bridge.FirstAttr.Developer;

public class BankSystem extends Program{

    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Creating bank system....");
        developer.developSomething();
    }
}
