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

        Builder aBuilder=new ConcreteABuilder();
        Director director=new Director(aBuilder);
        System.out.println(director.construct());

        Builder bBuilder=new ConcreteBBuilder();
        director=new Director(bBuilder);
        System.out.println(director.construct());
    }
}
