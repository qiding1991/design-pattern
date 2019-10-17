package com.qiding.design;

public class HungrySingleModel {
    private HungrySingleModel instance=new HungrySingleModel();
    private HungrySingleModel(){}
    public HungrySingleModel getInstance(){
        return instance;
    }
}
