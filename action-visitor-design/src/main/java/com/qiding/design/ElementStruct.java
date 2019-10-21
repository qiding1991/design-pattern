package com.qiding.design;

import java.util.ArrayList;
import java.util.List;

public class ElementStruct {
    private List<Element> list=new ArrayList<>();

    public  void add(Element element){
        list.add(element);
    }

    public  void remove(Element element){
        list.remove(element);
    }

    public void accept(Visitor visitor){
        list.forEach( info->info.accept(visitor));
    }
}
