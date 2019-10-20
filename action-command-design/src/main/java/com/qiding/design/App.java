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

        ReceiverA receiverA=new ReceiverA();
        Command commandA=new CommandA(receiverA);

        ReceiverB receiverB=new ReceiverB();
        Command commandB=new CommandB(receiverB);

        Invoker invoker=new Invoker(commandB);
        invoker.call();

    }
}
