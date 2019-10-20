package com.qiding.design;

import java.lang.reflect.Proxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //静态代理
        StaticProxy staticProxy=new StaticProxy("static");
        staticProxy.eat();
        staticProxy.play();
        staticProxy.swim();

        //动态代理
        MyServiceImpl myService=new MyServiceImpl("xxxxx");
        DynamicProxyHandler proxyHandler=new DynamicProxyHandler(myService);
        IMyService iMyService=(IMyService) Proxy.newProxyInstance(
                IMyService.class.getClassLoader(),new Class[]{IMyService.class},proxyHandler);

        iMyService.play();
        iMyService.eat();
        iMyService.swim();
    }
}
