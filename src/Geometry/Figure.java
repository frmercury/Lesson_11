package Geometry;

public abstract class Figure {

    private double legA, legB;

    public double getLegA() {
        return legA;
    }

    public double getLegB() {
        return legB;
    }

    public Figure(double legA, double legB) {
        this.legA = legA;
        this.legB = legB;
    }

    public abstract void getPerimeter ();
    public abstract void getArea ();
}