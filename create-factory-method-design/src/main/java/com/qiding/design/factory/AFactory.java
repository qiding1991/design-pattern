package com.qiding.design.factory;

import com.qiding.design.IFactory;
import com.qiding.design.IProduct;
import com.qiding.design.product.AProduct;

public class AFactory implements IFactory {
    @Override
    public IProduct create() {
        return new AProduct("hello world");
    }
}
