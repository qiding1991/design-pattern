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

        Subject subject=new ConcreteSubject();
        subject.addObserver(new ConcreteObserver1("我是1观察者"));
        subject.addObserver(new ConcreteObserver2("我是2观察者"));
        subject.notifyObserver();

    }
}
