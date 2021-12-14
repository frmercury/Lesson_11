package Geometry;

public class Rectangle extends Figure {

    public Rectangle(double legA, double legB) {
        super(legA, legB);
    }

    public void getPerimeter() {
        System.out.println("Rectangle perimeter is: " + (getLegA()*2 + getLegB()*2));
    }

    public void getArea() {
        System.out.println("Rectangle area is: " + getLegA()*getLegB());
    }
}

