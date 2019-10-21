package com.qiding.design;

public class StateA  implements State{
    @Override
    public void handle(Context context) {
        System.out.println("A处理请求");
        context.setState(new StateB());
    }
}
