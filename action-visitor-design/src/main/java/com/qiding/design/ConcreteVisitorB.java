package com.qiding.design;

public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("visit B viste"+concreteElementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB concreteElementb) {
        System.out.println("visit B viste"+concreteElementb.operationB());
    }
}
