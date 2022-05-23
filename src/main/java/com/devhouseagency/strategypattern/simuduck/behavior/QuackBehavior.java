package com.devhouseagency.strategypattern.simuduck.behavior;

/**
 * QuackBehavior is an interface that all quacking
 * classes implement. All new quacking classes
 * just need to implement the quack() method.
 * */
public interface QuackBehavior {
    void quack();
}
