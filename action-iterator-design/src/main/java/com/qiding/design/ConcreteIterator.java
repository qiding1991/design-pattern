package com.qiding.design;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator {
    List<Object> list = new ArrayList<>();
    int index =0;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Boolean hasNext(){
        return index<list.size();
    }

    @Override
    public Object next(){
        return list.get(index++);
    }

    @Override
    public Object first() {
        return list.get(0);
    }
}
