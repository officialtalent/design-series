package com.devhouseagency.strategypattern;

public class SimUDuck {
    public static void main(String[] args) {
        Duck[] ducks = {new MallardDuck(), new RedheadDuck()};

        for (Duck duck : ducks) {
            duck.display();
        }
    }
}
