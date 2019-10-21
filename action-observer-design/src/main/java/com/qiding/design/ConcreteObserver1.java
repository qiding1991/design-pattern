package com.qiding.design;

public class ConcreteObserver1 implements Observer {
    private String name;

    public ConcreteObserver1(String name) {
        this.name = name;
    }

    @Override
    public void observe() {
        System.out.println("我是1，我观察到了"+name);
    }
}
