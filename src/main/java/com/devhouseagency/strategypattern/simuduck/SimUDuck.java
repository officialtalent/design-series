package com.devhouseagency.strategypattern.simuduck;

import com.devhouseagency.strategypattern.simuduck.duck.Duck;
import com.devhouseagency.strategypattern.simuduck.duck.MallardDuck;
import com.devhouseagency.strategypattern.simuduck.duck.RedheadDuck;
import com.devhouseagency.strategypattern.simuduck.duck.RubberDuck;

public class SimUDuck {
    public static void main(String[] args) {
        Duck[] ducks = {new MallardDuck(), new RedheadDuck(), new RubberDuck()};

        for (Duck duck : ducks) {
            duck.display();
            duck.performFly();
            duck.performQuack();
        }
    }
}
