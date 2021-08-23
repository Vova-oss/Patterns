package com.example.demo.Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        singleton1.setSomeAttr("first singleton");

        Singleton singleton2 = Singleton.getSingleton();
        singleton2.getSomeAttr();;
        singleton2.setSomeAttr("second singleton");
        singleton1.getSomeAttr();
    }
}
