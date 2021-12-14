package Geometry;

public class FiguresParameters {

    public static void main(String[] args) {

        Figure rt1 = new RightTriangle(10,12);
        Figure r1 = new Rectangle(15,17);
        Figure rtr1 = new RectangularTrapezoid(5,12,4);

        Figure[] figures = {rt1,r1,rtr1};

        getArea(figures);
        getPerimeter(figures);
    }

    public static void getArea (Figure[] figure) {
        for (Figure f: figure)
            f.getArea();
            System.out.println("");
    }
    public static void getPerimeter (Figure[] figure) {
        for (Figure f: figure)
            f.getPerimeter();
            System.out.println("");
    }
}