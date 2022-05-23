package com.devhouseagency.strategypattern;

public class RubberDuck extends Duck {
    /*
    * Rubber ducks don't quack, so quack() is
    * overridden to "Squeak".
    * */
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }
}
