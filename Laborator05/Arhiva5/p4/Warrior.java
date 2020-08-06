package com.POOCC.lab05;

/**
 * 
 */
public class Warrior {
    protected static final int SNAKE_Warrior = 0;
    protected static final int OGRE_Warrior = 1;
    protected static final int MARSHMALLOW_MAN_Warrior = 2;

    //Stores one of the three above types
    private int type;
    //0 = dead, 100 = full strength
    protected int health;
    protected String name;

    public Warrior (/*int type, */int health, String name) {
        //this.type = type;
        this.health = health;
        this.name = name;
    }

    public int getDamage() {
        return 0;
    }

    public String toString() {
        String aux = "";

        aux = this.name + " " + this.health;
        return aux;
    }
}
