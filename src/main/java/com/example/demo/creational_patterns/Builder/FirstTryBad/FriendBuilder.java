package com.example.demo.creational_patterns.Builder.FirstTryBad;

public class FriendBuilder extends Builder{

    @Override
    public void setName() {
        user.setName("Best");
    }

    @Override
    public void setSurname() {
        user.setSurname("Friend");
    }

    @Override
    public void setAge() {
        user.setAge(18);
    }
}
