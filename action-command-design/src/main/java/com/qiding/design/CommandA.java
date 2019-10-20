package com.qiding.design;

public class CommandA implements Command {

    private ReceiverA receiverA;

    public CommandA(ReceiverA receiverA) {
        this.receiverA = receiverA;
    }

    @Override
    public void execute() {
         receiverA.methodA();
    }
}
