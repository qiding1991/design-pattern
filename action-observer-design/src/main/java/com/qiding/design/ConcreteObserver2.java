package com.qiding.design;

public class ConcreteObserver2 implements Observer {

    private String name;

    public ConcreteObserver2(String name) {
        this.name = name;
    }

    @Override
    public void observe() {
        System.out.println("我是2，我观察到了"+name);
    }
}
