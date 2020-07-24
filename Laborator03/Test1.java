import java.util.*;
import java.lang.*;

public class Test1 {
	public static void main(String args[]) {
		Punct a_punct = new Punct();
		Punct b_punct = new Punct();
		a_punct.setX(1);
		a_punct.setY(2);
		b_punct.setX(-1);
		b_punct.setY(3);

		System.out.println(a_punct.toString());
		System.out.println(b_punct.toString());
		System.out.println(a_punct.distance(b_punct));
		System.out.println(a_punct.distance(-1, 3));
	}
}