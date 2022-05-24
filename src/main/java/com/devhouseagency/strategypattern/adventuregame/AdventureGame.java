package com.devhouseagency.strategypattern.adventuregame;

import com.devhouseagency.strategypattern.adventuregame.character.*;
import com.devhouseagency.strategypattern.adventuregame.character.Character;

public class AdventureGame {
    public static void main(String[] args) {
        Character[] characters = {new Queen(), new King(), new Troll(), new Knight()};

        for (Character character : characters) {
            character.fight();
        }
    }
}
