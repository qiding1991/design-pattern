package com.qiding.design;

/**
 * 懒汉模式
 * 1使用在初始化
 * 2性能问题
 */
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
