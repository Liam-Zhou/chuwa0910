package com.chuwa.learn.designPattern.singleton.demo2;

public class Singleton {
    private Singleton(){}

    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}