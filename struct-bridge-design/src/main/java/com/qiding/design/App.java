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
        //抽象层进行聚合
        Implementor a=new AImplementor();
        Implementor b=new BImplementor();
        Abstraction abstraction=new AbstractionImpl(a);
        Abstraction babstraction=new AbstractionImpl(b);

        abstraction.operation();
        babstraction.operation();


    }
}
