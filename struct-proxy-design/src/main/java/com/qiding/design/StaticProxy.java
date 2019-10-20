package com.qiding.design;

public class StaticProxy  implements IMyService{
    private MyServiceImpl myService;
    private String name;

    public StaticProxy(String name) {
        this.myService = new MyServiceImpl(name);
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("proxy--begin");
        myService.swim();
        System.out.println("proxy--end");
    }

    @Override
    public void eat() {
        System.out.println("proxy--begin");
        myService.eat();
        System.out.println("proxy--end");
    }

    @Override
    public void play() {
        System.out.println("proxy--begin");
        myService.play();
        System.out.println("proxy--end");
    }
}
