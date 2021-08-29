package com.example.demo.structural_patterns.Decorator;

public class TeamLeader extends DeveloperDecorator{
    public TeamLeader(Developer developer) {
        super(developer);
    }

    public String teamLeaderActions(){
        return "Send info about tasks";
    }

    @Override
    public String writeCode() {
        return developer.writeCode() + teamLeaderActions();
    }
}
