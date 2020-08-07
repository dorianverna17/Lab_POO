/*
 * Programare orientata pe obiecte
 * Seria CC
 * 
 */
package Lab06;

/**
 *
 * @author Nan Mihai
 */
public abstract class Shape {
    protected String color;
    protected boolean filled;
    
    public Shape() {
        this("red", true);
    }
    
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled() {
        return filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}