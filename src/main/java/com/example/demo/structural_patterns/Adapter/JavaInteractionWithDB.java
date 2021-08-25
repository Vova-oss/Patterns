package com.example.demo.structural_patterns.Adapter;

public class JavaInteractionWithDB {

    public void insertObject(){
        System.out.println("Insert in DB");
    }

    public void updateObject(){
        System.out.println("Update in DB");
    }

    public void selectObject(){
        System.out.println("Select from DB");
    }

    public void deleteObject(){
        System.out.println("Delete from DB");
    }

}
