import java.util.*;

public class Problema6 {
	public boolean prim(int x) {
		if (x == 0 || x == 1) {
			return false;
		} else {
			int i;
			for (i = 2; i <= Math.sqrt(x); i++)
				if (x % i == 0)
					return false;
		}
		return true;
	}

	public static void main(String args[]) {
		int i;
		Problema6 object = new Problema6();
		for (i = 0; i <= 20; i++)
			if (object.prim(i))
				System.out.println("Numarul " + i + " este prim");
			else
				System.out.println("Numarul " + i + " nu este prim");				
	}
}