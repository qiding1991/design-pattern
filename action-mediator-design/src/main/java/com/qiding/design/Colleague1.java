package com.qiding.design;

public  class Colleague1  extends Colleague{
    private String name;

    public Colleague1(String name) {
        this.name = name;
    }

    @Override
    public Boolean equals(Colleague colleague) {
        return ((Colleague1)colleague).name.equals(this.name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("收到请求");
    }
}
