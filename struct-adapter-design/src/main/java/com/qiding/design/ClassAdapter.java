package com.qiding.design;

public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
         specificMethod();
    }
}
