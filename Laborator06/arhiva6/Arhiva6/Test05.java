/*
 * Programare orientata pe obiecte
 * Seria CC
 * Laboratorul 6
 */
package Lab06;

/**
 *
 * @author Nan Mihai
 */
public class Test05
 {
    public static void main(String args[]) {
        Tren t = new Tren();
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriB());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriB());
        t.addVagon(new CalatoriB());
        t.addVagon(new Marfa());
        System.out.println(t);

        Tren t1 = new Tren();
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriB());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriB());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new Marfa());
        System.out.println(t1);

        System.out.println(t.toCompare(t1));
    }
}
