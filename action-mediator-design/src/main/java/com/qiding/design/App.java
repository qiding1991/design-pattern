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

        Colleague colleague=new Colleague1("qi");
        Colleague colleague2=new Colleague1("ding");

        Mediator mediator=new ConcreteMediator();
        mediator.register(colleague);
        mediator.register(colleague2);
        colleague.send(colleague2);



    }
}
