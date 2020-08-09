import java.util.*;
import java.lang.*;
import java.io.*; 

public class Problema1 {
	public static TreeSet printWords(String string) throws FileNotFoundException {
		TreeSet<String> set1 = new TreeSet<String>();
		File file = new File(string); 
		Scanner sc = new Scanner(file); 
  
		while (sc.hasNextLine()) {
			set1.add(sc.nextLine());
		}
		return set1;
	}

	public static TreeSet printWordsComparator(TreeSet<String> set) {
		TreeSet<String> set2 = new TreeSet<String>(new Comparator<String>() {
			@Override
        	public int compare(String s1, String s2) {
            	return -s1.compareTo(s2);
        	}
		});
		for (String f : set) {
			System.out.println(f);
			set2.add(f);
			System.out.println(set2);
		}
		return set2;
	}

	public static void main(String args[]) throws FileNotFoundException {
		TreeSet<String> set1 = new TreeSet<String>();
		TreeSet<String> set2 = new TreeSet<String>(new Comparator<String>() {
			@Override
        	public int compare(String s1, String s2) {
            	if (s1.compareTo(s2) > 0)
            		return -1;
            	else if (s1.compareTo(s2) == 0)
            		return 0;
            	return 1;
        	}
		});
		set1 = printWords("da.txt");
		System.out.println(set1);
		set2 = printWordsComparator(set1);
		System.out.println();
		System.out.println();
		System.out.println(set2);
	}
}