package com.example.demo.structural_patterns.Decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String seniorAction(){
        return "Check code like senior. ";
    }

    @Override
    public String writeCode() {
        return developer.writeCode()+seniorAction();
    }
}
