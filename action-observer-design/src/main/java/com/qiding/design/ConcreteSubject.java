package com.qiding.design;

public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        observers.forEach(observer->observer.observe());
    }
}
