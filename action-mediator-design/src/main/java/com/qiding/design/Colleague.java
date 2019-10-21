package com.qiding.design;

public abstract class Colleague {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(Colleague colleague){
        mediator.replay(colleague);
    }
    public abstract void receive(Colleague colleague);

    public abstract Boolean equals(Colleague colleague);

}
