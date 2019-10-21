package com.qiding.design;

public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("visit A viste"+concreteElementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB concreteElementb) {
        System.out.println("visit A viste"+concreteElementb.operationB());
    }
}
