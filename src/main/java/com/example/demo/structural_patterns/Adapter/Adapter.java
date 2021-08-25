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
}
