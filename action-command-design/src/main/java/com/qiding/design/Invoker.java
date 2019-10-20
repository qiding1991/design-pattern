package com.qiding.design;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
