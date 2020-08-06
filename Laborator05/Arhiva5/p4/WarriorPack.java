package com.POOCC.lab05;

/**
 * 
 */
import java.util.*;

public class WarriorPack {
    private Vector<Warrior> warriors ;

    public WarriorPack () {
        warriors = new Vector();
    }

    public void addWarrior(Warrior newWarrior) {
        warriors.add(newWarrior);
    }

    public Vector getWarriors() {
        return warriors ;
    }

    public int calculateDamage() {
        int damage = 0;
        for (int i = 0; i < warriors.size(); i++) {
            damage += warriors.get(i).getDamage();
        }
        return damage;
    }

    public String toString() {
        String aux = "";
        int i;
        for (i = 0; i < warriors.size(); i++) {
            aux = aux + warriors.get(i).toString() + "\r\n";
        }
        return aux;
    }
}