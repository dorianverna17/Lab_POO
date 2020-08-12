import java.lang.*;
import java.util.*;
import java.io.*;

public class Problema4 {
	public static void main(String args[]) throws FileNotFoundException {
		TreeMap<String, LinkedList<Integer>> map = new TreeMap<String, LinkedList<Integer>>();
		Scanner sc2 = null;
    	try {
        	sc2 = new Scanner(new File("test01.txt"));
    	} catch (FileNotFoundException e) {
        	e.printStackTrace();  
    	}
    	String line;
    	StringTokenizer st;
    	int i = 1;
    	LinkedList list;

    	while (sc2.hasNextLine()) {
 			Scanner s2 = new Scanner(sc2.nextLine());
 			line = s2.nextLine();
    		System.out.println(line);
    		st = new StringTokenizer(line, " :,.-?");
    		while (st.hasMoreTokens()) {
				String newString = st.nextToken();
				if (!map.containsKey(newString)) {
					list = new LinkedList<Integer>();
					list.add(i);
				} else {
					list = map.get(newString);
					list.add(i);
				}
				map.put(newString, list);
			}
			i++;
    	}
    	Set set = map.entrySet();
 
    	// Get an iterator
   		Iterator it = set.iterator();
  
        // Displaying the values after iterating through the iterator 
        System.out.println("The iterator values are: "); 
        while (it.hasNext()) { 
            System.out.println(it.next()); 
        } 
	}
}