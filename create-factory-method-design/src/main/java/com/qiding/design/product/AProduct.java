package com.qiding.design.product;

import com.qiding.design.IProduct;

public class AProduct implements IProduct {
     private String name;

    public AProduct(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AProduct{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println(this);
    }
}
