package com.qiding.design;

public class ConcreteFlyweight implements Flyweight {
    private String key;

    public ConcreteFlyweight(String key) {
        System.out.println("创建新对象"+key);
        this.key = key;
    }

    @Override
    public void operation(UnShareableFlyweight unShareableFlyweight) {
        System.out.println(key+unShareableFlyweight.getInfo());
    }
}
