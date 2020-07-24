import java.util.*;
import java.lang.*;

class Numar {
	int nr;
	//returneaza suma dintre nr (membrul clasei) si a
	public int suma(int a) {
		return nr + a;
	}
	//returneaza suma dintre nr, a si b
	public int suma(int a, int b) {
		return nr + a + b;
	}
	//returneaza suma dintre nr, a, b si c
	public int suma(int a, int b, int c) {
		return nr + a + b + c;
	}
	//returneaza suma dintre nr, a, b, c si d
	public int suma(int a, int b, int c, int d) {
		return nr + a + b + c + d;
	}

	public static void main(String args[]) {
		Numar object = new Numar();
		Scanner myObj = new Scanner(System.in);

		object.nr = myObj.nextInt();
		System.out.println(object.suma(3));
		System.out.println(object.suma(3, 1));
		System.out.println(object.suma(3, 10, 12));
		System.out.println(object.suma(3, 1, 2, 5));
	}
}