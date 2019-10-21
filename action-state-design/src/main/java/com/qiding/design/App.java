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
        Context context=new Context();
        State state=new StateA();
        context.setState(state);

        context.handle();
        context.handle();
        context.handle();

    }
}
