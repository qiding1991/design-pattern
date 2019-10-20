package com.qiding.design;

public class ProtoType implements Cloneable {
   private  Integer age;
   private String name;

    public ProtoType() {
        System.out.println("无餐-对象实例化");
    }

    public ProtoType(Integer age, String name) {
        System.out.println("参数-对象实例化");
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "ProtoType{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("参数浅copy");
        return super.clone();
    }
}
