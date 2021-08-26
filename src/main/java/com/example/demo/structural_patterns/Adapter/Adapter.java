package com.example.demo.structural_patterns.Adapter;

public class Adapter extends JavaInteractionWithDB implements Database{
    @Override
    public void insert() {
        insertObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        selectObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }

    @Override
    public void deleteObject() {
        System.out.println("We can change some methods special for our new class");
    }
}
