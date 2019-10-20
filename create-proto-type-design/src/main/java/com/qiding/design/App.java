package com.qiding.design;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws CloneNotSupportedException {
        System.out.println( "Hello World!" );

        ProtoType originType=new ProtoType(100,"qiding");

        ProtoType copy=(ProtoType) originType.clone();

        copy.setAge(200);

        System.out.println(originType==copy);
        System.out.println(copy);
        System.out.println(originType);


    }
}
