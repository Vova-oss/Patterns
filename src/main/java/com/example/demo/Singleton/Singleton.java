package com.example.demo.Singleton;

public class Singleton {

    private static Singleton singleton;
    private static String someAttr;

    // Метод, который подойдёт только для однопоточной программы
    public static Singleton getSingleton(){
        if(singleton == null)
            return new Singleton();

        return singleton;
    }

    // Метод для многопоточность (появилось слово synchronized в объявлении метода)
    public static synchronized Singleton getSingletonForMultithreading(){
        if(singleton == null)
            return new Singleton();

        return singleton;
    }

    // Очень важно, чтобы дефолтный коструктор был приватным
    private Singleton(){

    }

    public void setSomeAttr(String attr){
        someAttr = attr;
    }

    public void getSomeAttr(){
        System.out.println(someAttr);
    }

}
