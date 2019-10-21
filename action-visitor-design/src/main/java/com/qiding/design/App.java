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

        ElementStruct struct=new ElementStruct();

        Element elementA=new ConcreteElementA();
        Element elementB=new ConcreteElementB();

        struct.add(elementA);
        struct.add(elementB);

        Visitor visitor=new ConcreteVisitorA();
        struct.accept(visitor);


        Visitor visitorB=new ConcreteVisitorB();
        struct.accept(visitorB);




    }
}
