import java.util.*;

class problema3 {
	public static int problema3_1(Vector<Integer> v, int x) {
		int i, nr = 0, a;

		for (i = 0; i < v.size(); i++) {
			a = v.get(i);
			if (a == x) {
				v.remove(i);
				i--;
				nr++;
			}
		}
		return nr;
	}

	public static void main(String args[]) {
		Vector<Integer> v = new Vector<Integer>(20);
		Random ran = new Random();
		int i, nr, sum = 0;

		for (i = 0; i < 20; i++) {
			nr = ran.nextInt(10);
			v.add(nr);
		}

		System.out.println(v);
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println(problema3_1(v, x));
		System.out.println(v);
		Object object = Collections.max(v);
		Object object1 = Collections.min(v);
		int index = v.indexOf(object1);
		System.out.println(object);
		System.out.println(index);
		for (i = 0; i < v.size(); i++)
			sum += v.get(i);
		double average = sum / v.size();
		System.out.println(average);
	}
}