package com.qiding.design;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Handler handler=new ConcreteHandlerA();
        Handler handlerB=new ConcreteHandlerB();

        handler.setNext(handlerB);

        handler.handlerRequest("c");

    }
}
