package com.devhouseagency.strategypattern.adventuregame.character;

import com.devhouseagency.strategypattern.adventuregame.behavior.AxeBehavior;

public class Knight extends Character{
    public Knight() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
