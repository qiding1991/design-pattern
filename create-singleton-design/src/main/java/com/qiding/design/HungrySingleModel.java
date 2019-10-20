package com.qiding.design;

/**
 * 饿汉模式
 * 类预先实例化，造成过多的无用的类
 * 自己开发的模块
 */
public class HungrySingleModel {
    private HungrySingleModel instance=new HungrySingleModel();
    private HungrySingleModel(){}
    public HungrySingleModel getInstance(){
        return instance;
    }
}
