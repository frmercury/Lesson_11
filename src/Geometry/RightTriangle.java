package Geometry;

public class RightTriangle extends Figure {

    public RightTriangle(double legA, double legB) {
        super(legA, legB);
    }

    public void getPerimeter() {

        double tp = Math.sqrt(Math.pow(getLegA(),2) +Math.pow(getLegB(),2) + getLegA() + getLegB());

        System.out.println("Right triangle perimeter is: " + tp);
    }

    public void getArea() {
        System.out.println("Right triangle area is: " + getLegA()*getLegB()/2);
    }
}