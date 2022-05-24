package com.devhouseagency.strategypattern.adventuregame.behavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("cutting with a knife");
    }
}
