package com.devhouseagency.strategypattern;

/**
 * All ducks quack and swim. The superclass takes care
 * of the implementation code.
 * */
public abstract class Duck {
    public void quack() {
        System.out.println("Quack...");
    }

    public void swim() {
        System.out.println("Swimming...");
    }

    /**
     * To make all ducks fly, the fly method is added
     * so that all ducks inheriting this class can
     * have a fly behavior.
     * */
    public void fly() {
        System.out.println("Flying...");
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
