package com.devhouseagency.strategypattern.adventuregame.behavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("chopping with an axe.");
    }
}
