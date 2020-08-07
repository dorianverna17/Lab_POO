package Lab06;

public class Square extends Rectangle {
    public Square() {
        this(5.0);
    }

    public Square(double side) {
        super(side, side);
        //this.width = side;
        //this.length = this.width;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        // this.width = side;
        // this.length = this.width;   
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    public void setLength(double side) {
        this.length = side;
    }

    public String toString() {
        String aux = "";

        if (super.filled == true)
            aux = "Filled " + this.color + "Rectangle with side: " + this.width;
        else
            aux = "Empty " + this.color + "Rectangle with side: " + this.width; 
        return aux;
    }
}