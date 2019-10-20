package com.qiding.design;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct(){
        return this.builder.getProduct();
    }
}
