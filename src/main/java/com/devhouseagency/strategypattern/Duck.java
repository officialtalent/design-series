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
     * By putting fly() in the superclass, Joe gave flying
     * ability to all ducks, including those that shouldn't.
     * */
    public void fly() {
        /*
        * We failed to notice that not all subclasses of Duck
        * should fly. When we added new behavior to the Duck
        * superclass. We now have inanimate objects in the
        * SimUDuck program.
        *
        * A localized update to the code caused a nonlocal
        * side effect (flying rubber ducks)!
        * */
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
