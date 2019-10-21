package com.qiding.design;

public abstract class Mediator {
    abstract void register(Colleague colleague);
    abstract void replay(Colleague colleague);
}
