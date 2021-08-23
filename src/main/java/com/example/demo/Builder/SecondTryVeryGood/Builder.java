package com.example.demo.Builder.SecondTryVeryGood;

public interface Builder {

    Builder setAge(int age);
    Builder setName(String name);
    Builder setSurname(String surname);

    Person getPerson();

}
