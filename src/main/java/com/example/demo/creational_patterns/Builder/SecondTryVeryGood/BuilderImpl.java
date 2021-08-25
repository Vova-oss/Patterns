package com.example.demo.creational_patterns.Builder.SecondTryVeryGood;

public class BuilderImpl implements Builder {

    Person person;
    public BuilderImpl(){
        person = new Person();
    }


    @Override
    public Builder setAge(int age) {
        person.setAge(age);
        return this;
    }

    @Override
    public Builder setName(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public Builder setSurname(String surname) {
        person.setSurname(surname);
        return this;
    }

    @Override
    public Person getPerson() {
        return person;
    }
}
