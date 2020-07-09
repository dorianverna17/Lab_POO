import java.util.*;

public class Problema5 {
	public String cenzurare(String text, String cuvinte[]) {
		StringTokenizer st = new StringTokenizer(text, " :,.-?");  
		int nr = 0, i, j;
		String finalString = "";

		while (st.hasMoreTokens()) {
			String newString = st.nextToken();
			i = 0;

			while (i < cuvinte.length) {
				if (cuvinte[i].equals(newString)) {
					String newString2 = "";
					for (j = 1; j < cuvinte[i].length() - 1; j++) {
						newString2 = newString2 + "*";
					}
					newString = newString.substring(0, 1) + newString2 +
					newString.substring(cuvinte[i].length() - 1); 
				}
				i++;
			}
			finalString = finalString + newString + " ";
		}
		return finalString;
	}
	public static void main(String args[]) {
		String text = "Un terorist avea o bomba";
		String cuvinte[] = new String[2];
		cuvinte[0] = "terorist";
		cuvinte[1] = "bomba";
		Problema5 prb5 = new Problema5();
		String rezultat;
		rezultat = prb5.cenzurare(text, cuvinte);
		System.out.println(rezultat);
	}
}