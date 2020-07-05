import java.util.*;

public class Problema8 {
	public static void cautare_binara(double[] array) {
		System.out.print("The number you seek: ");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();

		int index = Arrays.binarySearch(array, x);
		if (index >= 0)
			System.out.println(index);
		else
			System.out.println("The number is not in the vector");
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double[] vector = new double[n];
		int i;

		for (i = 0; i < n; i++) {
			vector[i] = Math.floor(Math.random() * 1000) / 100;
		}
		for (i = 0; i < n; i++) {
			System.out.println(String.format("%.2f", vector[i]));
		}
		Arrays.sort(vector);
		System.out.println("Vector after being sorted");
		for (i = 0; i < n; i++) {
			System.out.println(String.format("%.2f", vector[i]));
		}
		cautare_binara(vector);
	}
}