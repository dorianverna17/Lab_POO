import java.util.*;
import java.lang.*;

class Route {
	String origin;
	String destination;
 
	public Route(String str1, String str2) {
		this.origin = str1;
		this.destination = str2;
	}

	public boolean tur_retur() {
		if (origin.equals(destination))
			return true;
		return false;
	}
}

class ClockTime {
	int hour;
	int minute;

	public ClockTime(int a, int b) {
		this.hour = a;
		this.minute = b;
	}
}

class Schedule {
	ClockTime departure;
	ClockTime arrival;
	
	public Schedule(int a, int b, int c, int d) {
		this.departure = new ClockTime(a, b);
		this.arrival = new ClockTime(c, d);
	}

	public int duration() {
		int htom;

		if (arrival.hour > departure.hour) {
			htom = 60 * (arrival.hour - departure.hour);
			return htom -  departure.minute + arrival.minute;
		} else {
			htom = 60 * (24 - departure.hour + arrival.hour);
			return htom -  departure.minute + arrival.minute;
		}
	}
}

class Train {
	Route r;
	Schedule s;
	boolean local;

	public Train(Route r1, Schedule s1, boolean bool) {
		this.r = r1;
		this.s = s1;
		this.local = bool;
	}

	public String toString() {
		String aux = "";

		aux = aux + local + " " + r.origin + " (";
		if (s.departure.hour >= 0 && s.departure.hour <= 9)
			aux = aux + "0" + s.departure.hour;
		else aux = aux + s.departure.hour;
		aux = aux + ":";
		if (s.departure.minute >= 0 && s.departure.minute <= 9)
			aux = aux + "0" + s.departure.minute;
		else aux = aux + s.departure.minute;
		aux = aux + ") -> ";
		aux = aux + r.destination + " (";
		if (s.arrival.hour >= 0 && s.arrival.hour <= 9)
			aux = aux + "0" + s.arrival.hour;
		else aux = aux + s.arrival.hour;
		aux = aux + ":";
		if (s.arrival.minute >= 0 && s.arrival.minute <= 9)
			aux = aux + "0" + s.arrival.minute + ")";
		else aux = aux + s.arrival.minute + ")";
		return aux;
	}

	public int ticket_price() {
		int x;

		if (local == true)
			x = 1;
		else x = 2;
		return x * s.duration();
	}

	public static void main(String args[]) {
		Train t1 = new Train(new Route("Bucuresti Nord", "Constanta"),
			new Schedule(9, 35, 12, 2), true);
		Train t2 = new Train(new Route("Bucuresti Nord", "Iasi"),
			new Schedule(5, 45, 12, 49), true);
		Train t3 = new Train(new Route("Bucuresti Nord", "Sofia"),
			new Schedule(23, 45, 17, 0), false);
		Train t4 = new Train(new Route("Resita", "Resita"),
			new Schedule(23, 45, 17, 0), false);
		System.out.println(t1.toString());
		if (t3.r.tur_retur())
			System.out.println("Este Tur-Retur");
		else
			System.out.println("Nu este Tur-Retur");
		System.out.println(t1.ticket_price());
		System.out.println(t3.ticket_price());
	}
}