package com.qiding.design;

import com.qiding.design.factory.AFactory;
import com.qiding.design.factory.BFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        IFactory aFactory=new AFactory();
        IFactory bFactory=new BFactory();

        IProduct aproduct=aFactory.create();
        IProduct bproduct=bFactory.create();

        aproduct.show();
        bproduct.show();
    }
}
