package com.qiding.design.factory;

import com.qiding.design.IFactory;
import com.qiding.design.IProduct;
import com.qiding.design.product.BProduct;

public class BFactory implements IFactory {
    @Override
    public IProduct create() {
        return new BProduct(1000);
    }
}
