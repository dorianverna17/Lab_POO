package Lab06;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this (2.0, "red", true);
    }

    public Circle(double radius) {
        super("red", true);
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * this.radius;
    }

    public String toString() {
        String aux = "";

        if (super.filled == true)
            aux = "Filled " + this.color + "Circle with radius: " + this.radius;
        else
            aux = "Empty " + this.color + "Circle with radius: " + this.radius;
        return aux;
    }
}