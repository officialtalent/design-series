package com.devhouseagency.strategypattern.adventuregame.behavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Shooting an arrow with a bow.");
    }
}
