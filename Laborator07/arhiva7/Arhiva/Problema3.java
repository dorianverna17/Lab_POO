import java.lang.*;
import java.util.*;
import java.io.*;

class SListSet extends LinkedList implements SortedSet {
	Comparator obj;

	public SListSet() {
		obj = null;
	}

	public SListSet(Comparator obj) {
		this.obj = obj;
	}

	public Comparator comparator() {
		return new Comparator() {
        	@Override
        	public int compare(Object s1, Object s2) {
        	if (((String)s1).compareTo((String)s2) > 0)
          		return -1;
        	else if (((String)s1).compareTo((String)s2) == 0)
           		return 0;
         	return 1;
        	}
    	};
	}

	public boolean add(Object o) {//adauga un elemnt in multime daca nu exista deja si sorteaza multimea
		if (this.contains(o))
			return false;
		super.add(o);
		Collections.sort(this, this.obj);
		return true;
	}

	public static SListSet printWords_1(String string) throws FileNotFoundException {
		SListSet set1 = new SListSet();
		File file = new File(string); 
		Scanner sc = new Scanner(file); 
  
		while (sc.hasNextLine()) {
			set1.add(sc.nextLine());
		}
		return set1;
	}

	public SListSet printWords_2(String string) throws FileNotFoundException {
		SListSet set1 = new SListSet(this.obj);
		File file = new File(string); 
		
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			set1.add(sc.nextLine());
		}
		return set1;
	}

	public Object first() {//primul obiect din multime
		return this.get(0);
	}

	public Object last() {// ultimul obiect din multime
		return this.get(this.size() - 1);
	}

	public SortedSet subSet(Object from, Object to) {// o submultime ordonata
		SListSet set;
		int i;

		if (this.obj == null)
			set = new SListSet();
		else
			set = new SListSet(this.obj);
		
		for (i = (int)from; i <= (int)to; i++)
			set.add(this.get(i));
		return set;
	}

	public SortedSet headSet(Object to) {// o submultime cu primele  obiecte
		SListSet set;
		int i;

		if (this.obj == null)
			set = new SListSet();
		else
			set = new SListSet(this.obj);
		
		for (i = 0; i <= (int)to; i++)
			set.add(this.get(i));
		return set;
	}

	public SortedSet tailSet(Object from) {//o submultime cu ultimele obiecte
		SListSet set;
		int i;

		if (this.obj == null)
			set = new SListSet();
		else
			set = new SListSet(this.obj);
		
		for (i = (int)from; i <= this.size() - 1; i++)
			set.add(this.get(i));
		return set;
	}
}

public class Problema3 {
	public static void main(String args[]) {
		SListSet set1 = new SListSet();
		SListSet set2 = new SListSet(set1.comparator());
		try {
		set1 = set1.printWords_1("da.txt");
		set2 = set2.printWords_2("da.txt");
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Set1: " + set1);
		System.out.println("Set2: " + set2);
		System.out.println(set1.first());
		System.out.println(set1.last());
		System.out.println(set1.subSet(2, 4));
		System.out.println(set2.subSet(2, 4));
		System.out.println(set2.tailSet(2));
		System.out.println(set2.headSet(2));
		System.out.println(set1.tailSet(2));
		System.out.println(set1.headSet(2));
	}
}