package com.example.demo.structural_patterns.Bridge.SecondAttr;

import com.example.demo.structural_patterns.Bridge.FirstAttr.Developer;

public abstract class Program {

    // Эти 5 строк и являются мостом, ибо нам не пришлось делать наследование
    protected Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
