package com.qiding.design;

public class MyServiceImpl implements IMyService {
    private String name;

    public MyServiceImpl(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name+"swim");

    }

    @Override
    public void eat() {
        System.out.println(name+"eat");
    }

    @Override
    public void play() {
        System.out.println(name+"play");
    }
}
