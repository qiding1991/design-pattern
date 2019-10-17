package com.qiding.design;

public class LazySingleModel {
    private static volatile LazySingleModel instance;
    private LazySingleModel(){}
    public static synchronized LazySingleModel getInstance(){
        if(instance==null){
            instance=new LazySingleModel();
        }
        return instance;
    }
}
