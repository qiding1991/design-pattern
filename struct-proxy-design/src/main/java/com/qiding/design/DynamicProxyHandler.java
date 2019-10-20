package com.qiding.design;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler  implements InvocationHandler {
    private Object targetObject;
    public DynamicProxyHandler(Object targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理啦");
        return method.invoke(targetObject,args);
    }
}
