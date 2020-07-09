import java.util.*;

class problema2 {
	public static int p2(String args[]) {
		String[] array_string = args[0].split(" ");
		int i, nr = 0;
		for (i = 0; i < array_string.length; i++) {
			if (array_string[i].equals(args[1]))
				nr++;
		}
		return nr;
	}
	public static void main(String args[]) {
		if (args.length == 2)
			System.out.println(p2(args));
		else
			System.out.println("Nu s-au dat destule argumente");
	}
}