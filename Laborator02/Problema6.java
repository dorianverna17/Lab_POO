import java.util.*;
import java.lang.*;

public class Problema6 {
	public static void main (String args[]) {
		Vector v = new Vector();
		Vector<Integer> v1 = new Vector<Integer>(6);
		int i = 0;
		while(i < 6) {
			v1.add(0);
			i++;
		}

		v.add('g');
		v.add('s');
		v.add(7.5);
		v.add(7);
		v.add("String");
		v.add(10);
		v.add('d');
		v.add(false);
		System.out.println(v.get(0).getClass().getName());

		for (i = 0; i < v.size(); i++) {
			switch(v.get(i).getClass().getName()) {
				case "java.lang.Boolean":
					v1.set(0, v1.get(0) + 1);
					break;
				case "java.lang.Integer":
					v1.set(1, v1.get(1) + 1);
					break;
				case "java.lang.Character":
					v1.set(2, v1.get(2) + 1);
					break;
				case "java.lang.String":
					v1.set(3, v1.get(3) + 1);
					break;
				case "java.lang.Double":
					v1.set(4, v1.get(4) + 1);
					break;
				case "java.lang.Float":
					v1.set(5, v1.get(5) + 1);
					break;		
			}
		}
		System.out.println(v1);
	}
}