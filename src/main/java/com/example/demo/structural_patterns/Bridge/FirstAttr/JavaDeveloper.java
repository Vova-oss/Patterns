package com.example.demo.structural_patterns.Bridge.FirstAttr;

import com.example.demo.structural_patterns.Bridge.FirstAttr.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void developSomething() {
        System.out.println("Writing java code...");
    }
}
