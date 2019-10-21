package com.qiding.design;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        Aggregate aggregate=new ConcreteAggregate();
        aggregate.add("qi");
        aggregate.add("ding");
        aggregate.add("100");

       Iterator iterator= aggregate.getIterator();

       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
        System.out.println(iterator.first());
    }
}
