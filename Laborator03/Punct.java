import java.util.*;
import java.lang.*;

public class Punct {
	private int a;
	private int b;

	public Punct() {
		this.a = 0;
		this.b = 0;
	}

	public int getX() {
		return a;
	}

	public void setX(int x) {
		a = x;
	}

	public int getY() {
		return b;
	}

	public void setY(int y) {
		b = y;
	}

	public String toString() {
		return "(" + a + ", " + b + ")";
	}

	public double distance(int x, int y) {
		return Math.sqrt(Math.pow((x - a), 2) + Math.pow((y - b), 2));
	}

	public double distance(Punct p1) {
		return Math.sqrt(Math.pow((p1.getX() - this.getX()), 2) + Math.pow((p1.getY() - this.getY()), 2));
	}
}