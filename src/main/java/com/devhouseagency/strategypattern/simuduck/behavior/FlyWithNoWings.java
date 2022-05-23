package com.devhouseagency.strategypattern.simuduck.behavior;

public class FlyWithNoWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
