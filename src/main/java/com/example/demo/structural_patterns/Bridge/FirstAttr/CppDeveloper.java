package com.example.demo.structural_patterns.Bridge.FirstAttr;

import com.example.demo.structural_patterns.Bridge.FirstAttr.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void developSomething() {
        System.out.println("Writing cpp code...");
    }
}
