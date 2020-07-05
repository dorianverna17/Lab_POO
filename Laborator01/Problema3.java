class print_class {
	public void print(String str) {
		System.out.println(str);
	}
}

public class Problema3 {
	public static void main(String args[]) {
		print_class obiect = new print_class();
		obiect.print("Test");
	}
}