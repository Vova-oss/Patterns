package com.example.demo.creational_patterns.Builder.FirstTryBad;

public abstract class Builder {

    User user;

    public abstract void setName();
    public abstract void setSurname();
    public abstract void setAge();

    public void createUser(){
        user = new User();
    }

    public User getUser(){
        return user;
    }

}
