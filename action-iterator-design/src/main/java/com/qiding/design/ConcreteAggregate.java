package com.qiding.design;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    List<Object> list=new ArrayList<>();

    @Override
    public void add(Object item) {
        list.add(item);
    }

    @Override
    public void remove(Object item) {
        list.remove(item);
    }

    @Override
    public Iterator getIterator() {
       return new ConcreteIterator(list);
    }
}
