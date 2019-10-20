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

        //类结构适配器
        ClassAdapter classAdapter=new ClassAdapter();
        classAdapter.request();

        //对象结构型适配器
        Adaptee adaptee=new Adaptee();
        ObjectAdapter objectAdapter=new ObjectAdapter(adaptee);
        objectAdapter.request();

    }
}
