package com.example.demo.creational_patterns.Prototype;

public class Client {
    public static void main(String[] args) {
        // Создали оригинальный проект
        Project original = new Project("first", "good stuff", "v0.0.1");
        System.out.println(original);

        // Сделали копию оригинального проекта
        Project copy = (Project) original.copy();
        copy.setName("copy");
        System.out.println(copy);

        // Убедились, что оригинальный проект не подвергся изменениям
        System.out.println(original);
    }
}
