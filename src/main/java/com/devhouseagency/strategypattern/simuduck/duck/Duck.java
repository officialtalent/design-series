package com.devhouseagency.strategypattern.simuduck.duck;

import com.devhouseagency.strategypattern.simuduck.behavior.FlyBehavior;
import com.devhouseagency.strategypattern.simuduck.behavior.QuackBehavior;

/**
 * All ducks quack and swim. The superclass takes care
 * of the implementation code.
 * */
public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Swimming...");
    }

    /**
     * The display() method is abstract, since all duck
     * subtypes look different.
     * Each duck subtype is responsible for implementing
     * its own display() behavior for how it looks on
     * the screen.
     * */
    public abstract void display();
}
