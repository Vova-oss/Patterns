package com.example.demo.creational_patterns.Builder.SecondTryVeryGood;

public interface Builder {

    Builder setAge(int age);
    Builder setName(String name);
    Builder setSurname(String surname);

    Person getPerson();

}
