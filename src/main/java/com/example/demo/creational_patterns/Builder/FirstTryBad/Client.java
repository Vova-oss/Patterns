package com.example.demo.creational_patterns.Builder.FirstTryBad;

public class Client {
    public static void main(String[] args) {

        // Выбираем нужного строителя
//        Builder builder = new EnemyBuilder();
        Builder builder = new FriendBuilder();

        Director director = new Director(builder);
        User user = director.buildUser();
        System.out.println(user);

    }
}
