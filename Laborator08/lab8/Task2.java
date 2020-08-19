//package lab08;

import java.util.Comparator;
import java.util.*;
import java.lang.*;

@SuppressWarnings("serial")
class Catalog extends TreeSet<Catalog.Student> {
    Comparator<Catalog.Student> comparator;

    public Catalog(Comparator<Catalog.Student> comparator) {
        this.comparator = comparator;
    }

    public Catalog() {
        this.comparator = null;
    }

    public void addStudent(String name, double media, int clazz) {
        this.add(new Student(name, media, clazz));
        // Collections.sort(this, this.comparator);
    }

    public Student getStudent(String name) {
        Iterator<Catalog.Student> iterator = this.iterator();
        while(iterator.hasNext())
            if (iterator.next().name.equals(name))
                return iterator.next();
        return null;
    }

    public void removeStudent(String name) {
        Iterator<Catalog.Student> iterator = this.iterator();
        while(iterator.hasNext()) {
            Student stud = iterator.next();    
            System.out.println(stud.name);
            if (stud.name.equals(name)) {
                this.remove(stud);
                System.out.println(this);
            }
        }
    }

    public Catalog byClass(int clazz) {
        @SuppressWarnings("serial")
        Catalog cat = new Catalog(new Comparator<Catalog.Student>() {
            @Override
            public int compare(Catalog.Student o1, Catalog.Student o2) {
                if (o1.media > o2.media) {
                    return -1;
                } else {
                    if (o1.media < o2.media) {
                        return 1;
                    } else {
                        if (o1.name.compareTo(o2.name) > 0) {
                            return 1;
                        }
                    }
                return -1;
                }
            }
        });
        Iterator<Catalog.Student> iterator = this.iterator();
        while(iterator.hasNext())
            if (iterator.next().media == clazz)
                cat.addStudent(iterator.next().name, iterator.next().media, clazz);
        return cat;
    }

    public class Student implements Comparable<Object> {
        String name;
        double media;
        int clazz;

        public Student(String name, double media, int clazz) {
            this.name = name;
            this.media = media;
            this.clazz = clazz;
        }

        @Override
        public int compareTo(Object o) {
            Student obj = (Student) o;
            if (this.media > obj.media)
                return 1;
            else if (this.media < obj.media)
                return -1;
            else if (this.name.compareTo(obj.name) > 0)
                return 1;
            return -1;
        }

        public String toString() {
            return this.name + " " + this.media + " " + this.clazz;
        }
    }
}

public class Task2 {

    public static void main(String args[]) {
        Catalog catalog = new Catalog();
        catalog.addStudent("Alexandru", 7, 324);
        catalog.addStudent("Ioana", 5, 321);
        catalog.addStudent("Maria", 10, 322);
        catalog.addStudent("Ionut", 6.2, 323);
        catalog.addStudent("Diana", 7, 322);

        Catalog catalog2 = new Catalog(new Comparator<Catalog.Student>() {
            @Override
            public int compare(Catalog.Student o1, Catalog.Student o2) {
                // TODO: Sort by average (descending) and by name (ascending).
                if (o1.media > o2.media) {
                    return 1;
                } else {
                    if (o1.media < o2.media) {
                        return -1;
                    } else {
                        if (o1.name.compareTo(o2.name) > 0) {
                            return -1;
                        }
                    }
                }
                return 1;
            }
        });
        catalog2.addAll(catalog);

        System.out.println("Verificam...");
        System.out.println("Continutul colectiei: " + catalog);
        System.out.println("Continutul colectiei: " + catalog2);

        Catalog.Student last = null;
        for (Catalog.Student o : catalog) {
            if (last == null) {
                last = o;
                continue;
            }
            int r = last.media != o.media ? new Double(last.media).compareTo(o.media) : last.name.compareTo(o.name);
            if (r != last.compareTo(o)) {
                System.err.println("Catalog.Student.compareTo a fost implementata gresit.");
            }
        }

        if (catalog.size() != 5) {
            System.err.println("Catalog.size() a fost implementata gresit.");
        }

        catalog.removeStudent("Ionut");
        System.out.println("Continutul colectiei: " + catalog);
        if (catalog.size() != 4) {
            System.err.println("Catalog.remove() a fost implementata gresit.");
        }
        catalog.removeStudent("");
        if (catalog.size() != 4) {
            System.err.println("Catalog.remove() a fost implementata gresit.");
        }

        if (catalog.byClass(322).size() != 2) {
            System.err.println("Catalog.byClass() a fost implementata gresit.");
        }

        catalog.removeStudent("Maria");
        if (catalog.byClass(322).size() != 1) {
            System.err.println("Catalog.remove() a fost implementata gresit.");
        }

        if (catalog.getStudent("Maria") != null) {
            System.err.println("Catalog.getStudent() a fost implementata gresit.");
        }

        if ((catalog.getStudent("Alexandru") == null) || (catalog.getStudent("Alexandru").media != 7)) {
            System.err.println("Catalog.getStudent() a fost implementata gresit.");
        }
    }

}
