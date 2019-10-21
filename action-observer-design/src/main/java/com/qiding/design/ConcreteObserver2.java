package com.qiding.design;

public class ConcreteObserver1 implements Observer {
    @Override
    public void observe() {
        System.out.println("我是1，我观察到了");
    }
}
