package com.qiding.design;

public class CommandB implements Command {
   private ReceiverB receiverB;

    public CommandB(ReceiverB receiverB) {
        this.receiverB = receiverB;
    }

    @Override
    public void execute() {
        receiverB.methodB();
    }
}
