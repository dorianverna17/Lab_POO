import java.util.*;
import java.lang.*;

class Person {
	protected String name;
	protected String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		String aux;

		aux = this.name + " " + this.address;
		return aux;
	}
}

class Student extends Person {
	public Vector<String> courses;
	public Vector<Double> grades;

	public Student(String name, String address) {
		super(name, address);
		this.courses = new Vector<String>();
		this.grades = new Vector<Double>();
	}

	public String toString() {
		String aux = "";
		int i;

		for (i = 0; i < this.courses.size() - 1; i++)
			aux = aux + this.courses.get(i) + " ";
		aux = aux + this.courses.get(this.courses.size() - 1);
		aux = aux + "\r\n";
		for (i = 0; i < this.grades.size() - 1; i++)
			aux = aux + this.grades.get(i) + " ";
		aux = aux + this.grades.get(this.grades.size() - 1);
		aux = aux + "\r\n";
		aux = this.name + " " + this.address + " " + aux;
		return aux;
	}

	public void addCourseGrade(String course, double grade) {
		this.courses.add(course);
		this.grades.add(grade);
	}

	public void printGrades() {
		String aux = "";
		int i;

		for (i = 0; i < this.grades.size() - 1; i++)
			aux = aux + this.grades.get(i) + " ";
		aux = aux + this.grades.get(this.grades.size() - 1);
		aux = aux + "\r\n";
		System.out.println(aux);
	}

	public double getAverageGrade() {
		double aux = 0;
		int i;

		for (i = 0; i < this.grades.size(); i++)
			aux = aux + this.grades.get(i);

		try {
			return (double) aux / this.grades.size();
		} catch(Exception e) {
			System.out.println("There is no grade");
			return -1;
		}
	}
}

class Teacher extends Person {
	Vector<String> courses;

	public Teacher(String name, String address) {
		super(name, address);
		this.courses = new Vector<String>();
	}

	public String toString() {
		String aux = "";
		int i;

		for (i = 0; i < this.courses.size() - 1; i++)
			aux = aux + this.courses.get(i) + " ";
		aux = aux + this.courses.get(this.courses.size() - 1);
		aux = aux + "\r\n";
		aux = this.name + " " + this.address + " " + aux;
		return aux;
	}

	public boolean addCourse(String course) {
		if (!this.courses.contains(course)) {
			this.courses.add(course);
			return true;
		}
		return false;
	}

	public boolean removeCourse(String course) {
		if (this.courses.contains(course)) {
			this.courses.remove(course);
			return true;
		}
		return false;
	}
}

class Test4 {
    public static void main(String args[]) {
        Person student, teacher, person;
        student = new Student("Popescu Ion", "Bucuresti");
        teacher = new Teacher("Ionescu Gigel", "Bucuresti");
        person = new Person("Maria", "Iasi");
        assert (person.getName().equals("Maria")) : "Metoda getName din clasa Person nu este implementata corect";
        assert (((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).addCourse("Algoritmica")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).addCourse("Matematica")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (!((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).removeCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (!((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        ((Student) student).addCourseGrade("Programare", 10);
        ((Student) student).addCourseGrade("Algoritmica", 9);
        ((Student) student).addCourseGrade("Matematica", 8);
        assert (Math.abs(((Student) student).getAverageGrade() - 9.00) <= 0.001) : "Metoda getAverageGrade din clasa " +
                "Student nu a fost implementat corect";
        ((Student) student).printGrades();
        //Ce metoda toString se va apela? Din ce clasa?
        System.out.println(student);
        System.out.println(person);
        System.out.println("Felicitari! Problema a fost rezolvata corect!");
    }
}