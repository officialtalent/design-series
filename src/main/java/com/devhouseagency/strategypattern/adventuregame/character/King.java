package com.devhouseagency.strategypattern.adventuregame.character;

import com.devhouseagency.strategypattern.adventuregame.behavior.SwordBehavior;

public class King extends Character {
    public King() {
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
