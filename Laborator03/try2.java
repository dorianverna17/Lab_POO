class Point {
    int x, y;
 
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 
class Dimension {
    int width, height;
 
    public Dimension(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
 
class Rectangle {
    Point p;
    Dimension d;
 
    public Rectangle(Point p, Dimension d) {
        this.p = p;
        this.d = d;
    }
    
    public static void main(String args[]) {
        Rectangle patrat = new Rectangle(new Point(0, 0), new Dimension(10, 10));
    }
}