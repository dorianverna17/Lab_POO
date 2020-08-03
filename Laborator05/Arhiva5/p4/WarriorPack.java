package com.POOCC.lab05;

/**
 * 
 */
import java.util.*;

public class WarriorPack extends Warrior {
    private Vector<Warrior> warriors ;

    public WarriorPack () {
        warriors = new Vector<Warrior>();
    }

    public void addWarrior(Warrior newWarrior) {
        warriors.add(newWarrior);
    }

    public Vector<Warrior> getWarriors() {
        return warriors ;
    }

    // public int calculateDamage() {
    //     int damage = 0;
    //     for (int i = 0; i < warriors.size(); i++) {
    //         if (warriors.get(i).type == Warrior.SNAKE_Warrior) {
    //             //Snake does 10 damage
    //             damage += 10;
    //         } else if (warriors.get(i).type == Warrior.OGRE_Warrior) {
    //             //Ogre does 6 damage
    //             damage += 6;
    //         } else if (warriors.get(i).type == Warrior.MARSHMALLOW_MAN_Warrior) {
    //             //Marshmallow Man does 1 damage
    //             damage += 1;
    //         }
    //     }
    //     return damage;
    // }
}