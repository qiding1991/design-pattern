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

        Strategy a=new StrategyAImpl();
        Strategy b=new StrategyBImpl();

        StrategyContext context=new StrategyContext();
        context.setStrategy(a);
        context.opration();

        context.setStrategy(b);
        context.opration();




    }
}
