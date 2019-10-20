package com.qiding.design;

public class ConcreteBBuilder extends Builder {

    public ConcreteBBuilder() {
        super();
    }

    @Override
    public void buildPartA() {
        super.product.setPartA("buildPartA-B");
    }

    @Override
    public void buildPartB() {
        super.product.setPartB("buildPartB-B");
    }

    @Override
    public void buildPartC() {
        super.product.setPartC("buildPartC-B");
    }
}
