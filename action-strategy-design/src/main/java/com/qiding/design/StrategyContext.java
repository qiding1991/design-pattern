package com.qiding.design;

public class StrategyContext {
    private  Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void opration(){
        this.strategy.strategyMethod();
    }
}
