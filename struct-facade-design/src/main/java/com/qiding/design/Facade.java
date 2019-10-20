package com.qiding.design;

public class Facade {
    protected  SubSystem1 system1=new SubSystem1();
    protected  SubSystem2 system2=new SubSystem2();
    protected  SubSystem3 system3=new SubSystem3();

    public void method(){
        system1.method1();
        system2.method1();
        system3.method1();
    }
}
