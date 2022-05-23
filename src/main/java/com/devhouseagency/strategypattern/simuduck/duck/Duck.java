package com.devhouseagency.strategypattern.simuduck.duck;

/**
 * All ducks quack and swim. The superclass takes care
 * of the implementation code.
 * */
public abstract class Duck {
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
