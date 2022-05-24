package com.devhouseagency.strategypattern.adventuregame.character;

import com.devhouseagency.strategypattern.adventuregame.behavior.KnifeBehavior;

public class Queen extends Character {
    public Queen() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
