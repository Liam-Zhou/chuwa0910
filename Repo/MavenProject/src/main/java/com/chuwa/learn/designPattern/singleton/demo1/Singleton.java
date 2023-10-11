package com.chuwa.learn.designPattern.singleton.demo1;

public class Singleton {
    private Singleton(){}

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}