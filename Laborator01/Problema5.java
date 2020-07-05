import java.util.*;

public class Problema5 {
	public double putere(int baza, int exponent) {
		if (exponent == 0)
			return 1;
		else
			return baza * putere(baza, --exponent);
	}

	public static void afisare(int baza, int exponent) {
		Problema5 object = new Problema5();
		System.out.println(object.putere(baza, exponent));
		System.out.println(Math.pow(baza, exponent));
	}

	public static void main(String args[]) {
		Problema5.afisare(5, 3);
	}
}