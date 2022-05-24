package com.devhouseagency.strategypattern.simuduck.duck;

import com.devhouseagency.strategypattern.simuduck.behavior.FlyWithNoWings;
import com.devhouseagency.strategypattern.simuduck.behavior.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyWithNoWings();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
