import java.util.*;

class problema2_2 {
		public static int p2(String args[]) {
			StringTokenizer st = new StringTokenizer(args[0], " :,.-?");  
     		int nr = 0;
     		while (st.hasMoreTokens()) {
				if (st.nextToken().equals(args[1]))
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