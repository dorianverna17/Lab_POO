import java.lang.*;
import java.util.*;
import com.POOCC.lab05.WarriorPack;
import com.POOCC.lab05.Warrior;

public class Problema4 {
	public static void main(String args[]) {
		WarriorPack warr = new WarriorPack();
		Ogre_Warrior first = new Ogre_Warrior(45, "yasuo");
		Snake_Warrior second = new Snake_Warrior(70, "brand");
		warr.addWarrior(first);
		warr.addWarrior(second);
		System.out.println(warr.calculateDamage());
		System.out.println(warr.toString());
	}
}