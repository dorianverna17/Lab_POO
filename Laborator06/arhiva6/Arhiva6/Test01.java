/*
 * Programare orientata pe obiecte
 * Seria CC
 * Laboratorul 6
 * 
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import Lab06.Square;
import Lab06.Shape;
import Lab06.Circle;
import Lab06.Rectangle;
/**
 *
 * @author Nan Mihai
 */
public class Test01 {
    public static void main(String args[]) {
        boolean ok = true;
        //Verificarea relatiilor de mostenire
        Shape obj1;
        obj1 = new Square();
        obj1 = new Rectangle();
        obj1 = new Circle();
        Rectangle obj3 = new Square();
        //Verificarea constructorilor
        Constructor[] allConstructors = Square.class.getDeclaredConstructors();
        if(allConstructors.length != 3) {
            System.out.println("Clasa Square NU are definiti toti constructorii!");
            ok = false;
        }
        Circle circle = new Circle(2.0, "green", true);
        Square square = new Square(5.0, "black", true);
        if(!Modifier.isAbstract(Shape.class.getModifiers())) {
            System.out.println("Clasa Shape NU este abstracta!");
            ok = false;
        }
        if(!Shape.class.isAssignableFrom(Square.class) && !Rectangle.class.isAssignableFrom(Square.class)) {
            System.out.println("Clasele NU respecta relatia de mostenire descrisa!");
            ok = false;
        }
        if(!circle.isFilled() || !circle.getColor().equals("green")) {
            System.out.println("Constructorul din clasa Circle NU este definit conform specificatiilor!");
            ok = false;
        } else if(!square.isFilled() || !square.getColor().equals("black") || square.getWidth() != square.getLength()) {
            System.out.println("Constructorul din clasa Square NU este definit conform specificatiilor!");
            ok = false;
        } else if(ok){
            System.out.println("Au trecut toate testele!");
        }

        Rectangle object1 = new Rectangle();
        //Rectangle object2 = new Shape();    // nu merge, deoarece Shape este clasa abstracta
        Rectangle object3 = new Square();

        Square s = new Square();
        if (s instanceof Rectangle)
            System.out.println(((Rectangle)s).getArea());
        if (s instanceof Shape)
            System.out.println(((Shape)s).getArea());
        if ((Shape) s instanceof Circle) {
            System.out.println("Este corect");
        //    System.out.println(((Circle) s).getArea()); // produce eroare la compilare
        }

        //Conversie 1 // Nu va merge prima conversie
        // Circle c1 = new Circle();
        // Square sq = (Square) c1;
        //Conversie 2 // Va merge a doua conversie
        // Rectangle r = new Rectangle(5.0, 5.0);
        // Square sq = (Square) r;
        //Conversie 3 // Va merge si a treia conversie
        Square sq = new Square(7.0);
        Rectangle r = sq;
    }
}