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

        Component component=new ComponentImpl();
        Component director=new DirectorImpl(component);
        director.method();
    }
}
