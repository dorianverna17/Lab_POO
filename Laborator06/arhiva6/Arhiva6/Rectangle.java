package Lab06;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this(5.0, 6.0);
    }

    public Rectangle(double width, double length) {
        super("green", true);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * this.width + 2 * this.length;
    }

    public String toString() {
        String aux = "";

        if (super.filled == true)
            aux = "Filled " + this.color + "Rectangle with width: " + this.width + " and length: "
        + this.length;
        else
            aux = "Empty " + this.color + "Rectangle with width: " + this.width + " and length: "
        + this.length;
        return aux;   
    }
}