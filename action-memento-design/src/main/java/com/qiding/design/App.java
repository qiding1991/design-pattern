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

        Caretaker caretaker=new Caretaker();

        Originator originator=new Originator();
        originator.setState("s0");
        System.out.println(originator.getState());

        caretaker.setMemento(originator.createMemento());

        originator.setState("s1");
        System.out.println(originator.getState());

        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());








    }
}
