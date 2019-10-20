package com.qiding.design.product;

import com.qiding.design.IProduct;

public class BProduct implements IProduct {
    private Integer count;

    public BProduct(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "BProduct{" +
                "count=" + count +
                '}';
    }

    @Override
    public void show() {
        System.out.println(this);
    }
}
