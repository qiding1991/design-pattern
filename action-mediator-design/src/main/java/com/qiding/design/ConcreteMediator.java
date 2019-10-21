package com.qiding.design;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues=new ArrayList<>();

    @Override
    void register(Colleague colleague) {
        colleagues.add(colleague);
        colleague.setMediator(this);
    }

    @Override
    void replay(Colleague colleague) {
        for (Colleague c1:colleagues){
            if(c1.equals(colleague)){
                c1.receive(colleague);
            }
        }
    }
}
