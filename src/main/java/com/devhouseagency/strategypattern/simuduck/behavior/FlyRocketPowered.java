package com.devhouseagency.strategypattern.simuduck.behavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying like a rocket!");
    }
}
