package com.qiding.design;

public class Director implements Component {

    private Component component;

    public Director(Component component) {
        this.component = component;
    }

    @Override
    public void method() {
        component.method();
    }
}
