import java.lang.*;
import java.util.*;

interface Persoana extends Comparable {
    public double calculMedieGenerala();
    public String getNume();
    public void setNume(String nume);
    public void addMedie(double medie);
}

class Student implements Persoana {
	private String name;
	private Vector<Double> vector; 

	public Student() {
		vector = new Vector<Double>();
		vector.add(9.5);
		vector.add(7.5);
		vector.add(6.5);
		//this("Popescu", vector);
		this.name = "Popescu";
		this.vector = vector;
	}

	public Student(String name, Vector<Double> vector) {
		this.vector = vector;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		Student obj = (Student) o;
		if (this.name.compareTo(obj.name) > 0)
			return 1;
		else if (this.name.compareTo(obj.name) < 0)
			return -1;
		else if (this.calculMedieGenerala() <= obj.calculMedieGenerala())
			return -1;
		else
			return 1;
	}

	public double calculMedieGenerala() {
		int i;
		double sum = 0;

		for (i = 0; i < this.vector.size(); i++)
			sum = sum + this.vector.get(i);
		return sum / this.vector.size();
	}

	public String getNume() {
		return this.name;
	}

	public void setNume(String nume) {
		this.name = name;
	}

	public void addMedie(double medie) {
		this.vector.add(medie);
	}

	public String toString() {
		String result = this.name + " " + this.calculMedieGenerala();
		return result;
	}
}

public class Problema2 {
	public static void main(String args[]) {
		Vector<Student> v = new Vector<Student>();
		Student student1 = new Student();
		v.add(student1);
		Vector<Double> v1 = new Vector<Double>();
		v1.add(3.4);
		v1.add(1.0);
		v1.add(7.0);
		Student student2 = new Student("Ionescu", v1);
		Vector<Double> v2 = new Vector<Double>();
		v2.add(3.6);
		v2.add(5.7);
		v2.add(7.2);
		Student student3 = new Student("Ionescu", v2);
		v.add(student2);
		v.add(student3);
		Collections.sort(v);
		System.out.println(v);
	}
}