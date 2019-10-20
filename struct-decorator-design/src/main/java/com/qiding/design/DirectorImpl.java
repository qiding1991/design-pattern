package com.qiding.design;

public class DirectorImpl extends Director {
    public DirectorImpl(Component component) {
        super(component);
    }
    public void addFunction(){
        System.out.println("添加一些功能");
    }

    @Override
    public void method() {
        super.method();
        addFunction();
    }
}
