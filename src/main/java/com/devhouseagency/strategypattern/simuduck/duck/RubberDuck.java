package com.devhouseagency.strategypattern.simuduck.duck;

import com.devhouseagency.strategypattern.simuduck.behavior.FlyWithNoWings;
import com.devhouseagency.strategypattern.simuduck.behavior.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithNoWings();
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }
}
