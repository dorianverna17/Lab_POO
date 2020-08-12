import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map.*;

public class Problema5 {
	public static HashMap<String, Integer> folderSize(File directory) {
    	HashMap<String, Integer> hmap = new HashMap<String, Integer>(); 
    	int length = 0;
    	for (File file : directory.listFiles()) {
        	if (file.isFile()) {
        		hmap.put(file.getName(), (int)file.length());
        		// file.length is in bytes
        		// if you want kb just write /1024 (return double ofc)
        	}
    	}
    	return hmap;
	}

	public static TreeMap<String, Integer> folderSize_2(File directory) {
    	TreeMap<String, Integer> hmap = new TreeMap<String, Integer>(); 
    	int length = 0;
    	for (File file : directory.listFiles()) {
        	if (file.isFile()) {
        		hmap.put(file.getName(), (int)file.length());
        		// file.length is in bytes
        		// if you want kb just write /1024 (return double ofc)
        	}
    	}
    	return hmap;
	}

	public static void main(String args[]) {
		String currentDirectory = System.getProperty("user.dir");
		File current = new File(currentDirectory);
		//folderSize(current);
		HashMap<String, Integer> hmap = folderSize(current);
		TreeMap<String, Integer> tmap = folderSize_2(current);

		Set set = hmap.entrySet();
 
    	// Get an iterator
   		Iterator it = set.iterator();
  
        // Displaying the values after iterating through the iterator 
        System.out.println("The iterator values are: "); 
        while (it.hasNext()) { 
            System.out.println(it.next()); 
		}

		System.out.println();
		set = tmap.entrySet();
 
    	// Get an iterator
   		it = set.iterator();
  
        // Displaying the values after iterating through the iterator 
        System.out.println("The iterator values are: "); 
        while (it.hasNext()) { 
            System.out.println(it.next()); 
        }

        LinkedList<Integer> mapValues = new LinkedList<Integer>(hmap.values());
		Collections.sort(mapValues);
		System.out.println();
		for (Integer x : mapValues) {
			for (Entry<String, Integer> entry : hmap.entrySet()) {
            	if (entry.getValue().equals(x)) {
                	System.out.println(entry.getKey() + " " + x);
            	}
        	}
		}

		Set<String> keys = tmap.keySet();
		List<String> list_keys = new ArrayList<String>(keys) ; 
		Collections.sort(list_keys);
		System.out.println();
		for (String x : list_keys) {
			for (Entry<String, Integer> entry : tmap.entrySet()) {
            	if (entry.getKey().equals(x)) {
                	System.out.println(x + " " + entry.getValue());
            	}
        	}
		}
	}
}