import java.util.*;
import java.lang.*;

class Array {
    //Vectorul in care se vor retine elementele
    private Vector vector;
 
    //Constructor clasei
    public Array() {
        //Instantierea vectorului cu elemente
        vector = new Vector();
    }
 
    //Metoda care adauga un element in vector, folosind pozitia curenta
    public void addElement(Integer x) {
        vector.add(x);
    }
 
    //Metoda care adauga un element in vector, tinand cont de pozitia indicata
    public void addElement(Integer x, int poz) {
        if(poz >= 0 && poz <= vector.size()) {
            vector.add(poz, x);
        }
    }
 
    //Metoda care returneaza elementul aflat in vector la pozitia indicata
    public int get(int poz) {
        int result;
        if(poz >= 0 && poz < vector.size()) {
            result = (int) vector.get(poz);
            return result;
        } else {
            return Integer.MIN_VALUE;
        }
    }
 
    //Metoda ce intoarce numarul de elemente din vector
    public int getSize() {
        return vector.size();
    }
 
    //Metoda pentru stergerea unui element din vector
    public boolean remove(Integer x) {
        return vector.remove(x);
    }
 
    //Metoda pentru stergerea elementului de pe pozitia pos din vector
    public Integer remove(int pos) {
        return (Integer) vector.remove(pos);
    }
 
    //Metoda uzitata pentru afisarea unui obiect de tip Array
    public String toString() {
        String result = "{";
        for(int i = 0; i < vector.size(); i++) {
            result += get(i) + ", ";
        }
        result += "}";
        return result;
    }
 
    public void sort() {
        Collections.sort(vector);
    }
}

class SortedArray extends Array {
	private Vector vector;

	public SortedArray() {
		this.vector = new Vector();
		// if (vector.size() == 0)
		// 	return;
		Collections.sort(this.vector);
	}

	public void addElement(Integer x) {
        this.vector.add(x);
    	Collections.sort(this.vector);
    }

    public int get(int poz) {
        int result;
        if(poz >= 0 && poz < vector.size()) {
            result = (int) vector.get(poz);
            return result;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public String toString() {
    	return this.vector.toString();
    }

    public void sort() {
        Collections.sort(vector);
    }
}

class MyStack {
	private Array arr;

	public MyStack() {
		arr = new Array();
	}

	public void push(Integer value) {
		arr.addElement(value, arr.getSize());
	}

	public Integer pop() {
		return arr.remove(arr.getSize() - 1);
	}

	public String toString() {
    	return arr.toString();
    }
}

public class Problema2 {
	public static void main(String args[]) {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(4);
		stack.push(2);
		stack.push(3);
		stack.pop();
		System.out.println(stack.toString());

		SortedArray sarr = new SortedArray();
		sarr.addElement(1);
		System.out.println(sarr.toString());
		sarr.addElement(4);
		System.out.println(sarr.toString());
		sarr.addElement(2);
		System.out.println(sarr.toString());
		sarr.addElement(3);
		System.out.println(sarr.toString());
		sarr.addElement(0);
		System.out.println(sarr.toString());
	}
}