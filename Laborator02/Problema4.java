import java.util.*;

class problema4 {
	public static Vector<Integer> reunion(Vector<Integer> v1,
		Vector<Integer> v2) {
		Vector<Integer> v3 = new Vector<Integer>();
		int i = 0, j = 0;

		while (i < v1.size() && j < v2.size()) {
			if (v1.get(i) < v2.get(j)) {
				v3.add(v1.get(i));
				i++;		
			} else {
				v3.add(v2.get(j));
				j++;
			}
		}
		if (i == v1.size()) {
			while (j < v2.size()) {
				v3.add(v2.get(j));
				j++;
			}
		} else {
			while (i < v1.size()) {
				v3.add(v1.get(i));
				i++;
			}
		}
		return v3;
	}

	public static Vector<Integer> intersection(Vector<Integer> v1,
		Vector<Integer> v2) {
		int i;
		Vector<Integer> v3 = new Vector<Integer>();

		for (i = 0; i < v1.size(); i++)
			if (v2.contains(v1.get(i)))
				v3.add(v1.get(i));
		return v3;
	}

	public static Vector<Integer> diference(Vector<Integer> v1,
		Vector<Integer> v2) {
		int i;
		Vector<Integer> v3 = new Vector<Integer>();

		for (i = 0; i < v1.size(); i++) {
			if (!v2.contains(v1.get(i)))
				v3.add(v1.get(i));
		}
		return v3;
	}

	public static void main(String args[]) {
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		int i = 0;

		while(v1.size() < 10) {
			v1.add(i);
			i += 2;
		}
		i = 1;
		while(v2.size() < 10) {
			v2.add(i);
			i += 2;
		}
		System.out.println(v1);
		System.out.println(v2);
		Vector<Integer> v3 = reunion(v1, v2);
		System.out.println(v3);
		v2.add(2);
		Vector<Integer> v4 = intersection(v1, v2);
		System.out.println(v4);
		Vector<Integer> v5 = diference(v1, v2);
		System.out.println(v5);
	}
}