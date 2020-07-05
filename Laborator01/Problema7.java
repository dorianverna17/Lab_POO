import java.util.*;

public class Problema7 {
	public static boolean prim(int x) {
		if (x == 0) {
			return false;
		} else {
			int i;
			for (i = 2; i <= Math.sqrt(x); i++)
				if (x % i == 0)
					return false;
		}
		return true;
	}

	public static void Goldbach(int n) {
		int i, j;

		for (i = 2; i <= n; i++) {
			if (i % 2 == 0) {
				for (j = 2; j <= i; j++)
					if (prim(j) && prim(i - j))
						System.out.println(i + " = " + j + " + " + (i - j));
			}
		}
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		Problema7.Goldbach(n);
	}
}