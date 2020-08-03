import java.util.*;
import java.lang.*;

// Am comentat tratarea exceptiei din main pentru ca dupa aceea nu
// mai este indeplinit scopul programului
class NumarNegativ extends Exception {
	public NumarNegativ() {
		super("Numarul introdus este negativ!");
	}
}

public class Problema3{
	public static Vector<Integer> myRead() throws NumarNegativ{
		Vector<Integer> vector = new Vector<Integer>();
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt(); 
		if (x < 0)
			throw new NumarNegativ();
		while (x >= 0) {
			vector.add(x);
			obj = new Scanner(System.in);
			x = obj.nextInt();
			if (x < 0)
				throw new NumarNegativ();
		}
		return vector;
	}

	public static void main(String args[]) {
		Vector<Integer> vector = new Vector<Integer>();
		try {
			vector = myRead();
			System.out.println(vector);
			System.out.println(Collections.max(vector));
		} catch(NumarNegativ e){
			e.printStackTrace();
		};
	}
}