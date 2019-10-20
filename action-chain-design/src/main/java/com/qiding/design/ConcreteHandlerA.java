package com.qiding.design;

public class ConcreteHandlerA extends Handler {


    @Override
    public void handlerRequest(String request) {
        if(request.equals("1")){
            System.out.println("我是A，我处理啦");
        }else if(getNext()!=null){
            getNext().handlerRequest(request);
        }else {
            System.out.println("不支持的");
        }

    }
}
