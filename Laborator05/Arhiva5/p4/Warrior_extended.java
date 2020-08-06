import java.lang.*;
import java.util.*;
import com.POOCC.lab05.WarriorPack;
import com.POOCC.lab05.Warrior;

class Snake_Warrior extends Warrior {
    public Snake_Warrior(int health, String name) {
        super(health, name);
    }

    public int getDamage() {
        return 10;
    }

    public String toString() {
        String aux = "";

        aux = "Snake Warrior " + this.name + " " + this.health;
        return aux;
    }
}

class Ogre_Warrior extends Warrior {
    public Ogre_Warrior(int health, String name) {
        super(health, name);
    }

    public int getDamage() {
        return 6;
    }

    public String toString() {
        String aux = "";

        aux = "Ogre Warrior " + this.name + " " + this.health;
        return aux;
    }
}

class Marshmallow_Man_Warrior extends Warrior {
    public Marshmallow_Man_Warrior(int health, String name) {
        super(health, name);    
    }

    public int getDamage() {
        return 1;
    }

    public String toString() {
        String aux = "";

        aux = "Marshmallow Man Warrior " + this.name + " " + this.health;
        return aux;
    }
}