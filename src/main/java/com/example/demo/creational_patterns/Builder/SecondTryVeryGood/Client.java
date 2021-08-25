package com.example.demo.creational_patterns.Builder.SecondTryVeryGood;

public class Client {
    public static void main(String[] args) {
        Person person = new BuilderImpl().setAge(33).setName("Vova").getPerson();
        System.out.println(person);

        person = new BuilderImpl().setSurname("Surname").setName("secondanme").getPerson();
        System.out.println(person);
    }
}
