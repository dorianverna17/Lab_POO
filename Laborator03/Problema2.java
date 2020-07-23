import java.util.*;
import java.lang.*;

class Produs {
	String nume;
	double pret;
	int cantitate;

	public Produs(String name, double price, int quantity) {
		this.nume = name;
		this.pret = price;
		this.cantitate = quantity;
	}

	public Produs() {
		this("Cascaval", 8.5, 100);
	}

	public String toString() {
		return this.nume + " " + this.pret + " " + this.cantitate;
	}

	public double getTotalProdus() {
		return this.pret * this.cantitate;
	}
}

class Magazin {
	String nume;
	Produs produs[];

	public Magazin(String name, Produs p[]) {
		this.nume = name;
		produs = new Produs[3];
		this.produs[0] = p[0];
		this.produs[1] = p[1];
		this.produs[2] = p[2];
	}

	public String toString() {
		int i;
		String aux = "";

		for (i = 0; i < 2; i++) {
			aux = aux + this.produs[i].toString() + "\r\n";
		}
		aux = aux + this.produs[2].toString();
		return aux;
	}

	public double getTotalMagazin() {
		double total = 0;
		int i;

		for(i = 0; i < 3; i++) {
			total = total + this.produs[i].pret * this.produs[i].cantitate;
		}
		return total;
	}
}

public class Problema2 {
	public static void main(String args[]) {
		Produs p[] = new Produs[3];
		p[0] = new Produs("Lapte", 5.5, 50);
		p[1] = new Produs("Salam", 3.5, 80);
		p[2] = new Produs();
		// System.out.println(p[0].toString());
		// System.out.println(p[2].toString());
		// System.out.println(p[0].toString());
		// System.out.println(p[1].toString());
		Magazin m = new Magazin("La Sabie", p);
		System.out.println(m.toString());
		System.out.println(m.produs[0].getTotalProdus());
		System.out.println(m.getTotalMagazin());
	}
}