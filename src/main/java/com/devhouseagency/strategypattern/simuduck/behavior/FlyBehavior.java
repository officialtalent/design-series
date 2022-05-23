package com.devhouseagency.strategypattern.simuduck.behavior;

/**
 * FlyBehavior is an interface that all flying
 * classes implement. All new flying classes
 * just need to implement the fly() method.
 * */
public interface FlyBehavior {
    void fly();
}
