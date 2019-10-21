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
        FlyweightFactory factory=new FlyweightFactory();
        Flyweight flyweighta=factory.getFlyweight("a");
        Flyweight flyweightb=factory.getFlyweight("b");

        UnShareableFlyweight unShareable=new UnShareableFlyweight("im change");

        flyweighta.operation(unShareable);

        unShareable.setInfo("change agin");
        flyweightb.operation(unShareable);
    }
}
