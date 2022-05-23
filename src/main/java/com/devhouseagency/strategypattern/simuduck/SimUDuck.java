package com.devhouseagency.strategypattern.simuduck;

import com.devhouseagency.strategypattern.simuduck.duck.Duck;
import com.devhouseagency.strategypattern.simuduck.duck.MallardDuck;
import com.devhouseagency.strategypattern.simuduck.duck.RedheadDuck;

public class SimUDuck {
    public static void main(String[] args) {
        Duck[] ducks = {new MallardDuck(), new RedheadDuck()};

        for (Duck duck : ducks) {
            duck.display();
        }
    }
}
