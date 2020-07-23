import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;

class Fractie {
	double a;
	double b;

	public Fractie(int num1, int num2) {
		this.a = num1;
		this.b = num2;
	}

	public Fractie() {
		this(1, 2);
	}

	public double Adunare(Fractie f) {
		return this.a / this.b + f.a / f.b;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		return this.a + " / " + this.b + " = " + df.format((this.a / this.b));
	}

	public boolean equals(Fractie f) {
		if ((this.a / this.b) == (f.a / f.b))
			return true;
		return false;
	}

}

public class Problema1 {
	public static void main(String args[]) {
		Fractie f1 = new Fractie(1, 2);
		Fractie f2 = new Fractie();
		System.out.println(f1.toString());
		System.out.println(f1.equals(f2));
		System.out.println(f1.Adunare(f2));
	}
}