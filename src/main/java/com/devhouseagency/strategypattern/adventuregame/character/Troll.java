package com.devhouseagency.strategypattern.adventuregame.character;

import com.devhouseagency.strategypattern.adventuregame.behavior.BowAndArrowBehavior;

public class Troll extends Character {
    public Troll() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
