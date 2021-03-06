package com.example.demo.creational_patterns.Builder.FirstTryBad;

public class Director {

    Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public User buildUser(){
        builder.createUser();
        builder.setName();
        builder.setSurname();
        builder.setAge();

        return builder.getUser();
    }

}
