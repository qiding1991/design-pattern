package com.qiding.design;

public abstract class Builder  {
    protected Product product;

    public Builder() {
        this.product = new Product();
    }

    public Product getProduct() {
        buildPartA();
        buildPartB();
        buildPartC();
        return this.product;
    }
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
}
