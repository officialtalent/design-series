package com.devhouseagency.strategypattern.simuduck.duck;

import com.devhouseagency.strategypattern.simuduck.behavior.FlyWithWings;
import com.devhouseagency.strategypattern.simuduck.behavior.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Redhead Duck");
    }
}
