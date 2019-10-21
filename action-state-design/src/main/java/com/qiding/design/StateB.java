package com.qiding.design;

public class StateB implements State{
    @Override
    public void handle(Context context) {
        System.out.println("B处理请求");
        context.setState(new StateA());
    }
}
