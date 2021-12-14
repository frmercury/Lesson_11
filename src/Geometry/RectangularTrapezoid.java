package Geometry;

public class RectangularTrapezoid extends Figure {

    public RectangularTrapezoid(double legA, double legB, double height) {
        super(legA, legB);
        this.height = height;
    }

    private double height;

    public void getPerimeter() {
        double rtp = getLegA() + getLegB() + height + Math.sqrt(Math.pow((getLegB() - getLegA()),2) + Math.pow(height,2)); // LegB нижнее остнование, LegA - верхнее основание.
        System.out.println("Rectangular trapezoid perimeter is: " + rtp);
    }

    public void getArea() {
        System.out.println("Rectangular trapezoid area is: " + (getLegA()+getLegB())*height/2);
    }
}