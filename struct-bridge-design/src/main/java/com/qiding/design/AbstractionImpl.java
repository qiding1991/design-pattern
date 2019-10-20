package com.qiding.design;

public class AbstractionImpl extends Abstraction {

    public AbstractionImpl(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        implementor.method();
    }
}
