package com.qiding.design;

public interface Aggregate {

    void add(Object item);

    void remove(Object item);

    Iterator getIterator();
}
