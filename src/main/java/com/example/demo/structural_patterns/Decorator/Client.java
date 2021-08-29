package com.example.demo.structural_patterns.Decorator;

public class Client {
    public static void main(String[] args) {

        Developer developer = new JavaDeveloper();
        Developer senior = new SeniorJavaDeveloper(new JavaDeveloper());
        Developer teamLeader = new TeamLeader(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.writeCode());
        System.out.println(senior.writeCode());
        System.out.println(teamLeader.writeCode());
    }
}
