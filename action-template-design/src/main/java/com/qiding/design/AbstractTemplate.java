package com.qiding.design;

public  abstract  class AbstractTemplate {
    public void operation(){
        operation1();
        operation2();
    }
    protected abstract  void operation1();
    protected abstract  void operation2();
}
