package com.qiding.design;

public class ConcreteABuilder extends Builder {

    public ConcreteABuilder() {
        super();
    }

    @Override
    public void buildPartA() {
        super.product.setPartA("buildPartA-A");
    }

    @Override
    public void buildPartB() {
        super.product.setPartB("buildPartB-A");
    }

    @Override
    public void buildPartC() {
        super.product.setPartC("buildPartC-A");
    }
}
