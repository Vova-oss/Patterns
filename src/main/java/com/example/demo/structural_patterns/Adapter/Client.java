package com.example.demo.structural_patterns.Adapter;

public class Client {

    public static void main(String[] args) {
        Database database = new Adapter();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }

}
