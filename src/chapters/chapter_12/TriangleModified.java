package chapters.chapter_12;

import chapters.chapter_11.GeometricObject;

public class TriangleModified extends GeometricObject {

    protected double side1;
    protected double side2;
    protected double side3;

    public TriangleModified() {
        super();
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public TriangleModified(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public TriangleModified(double side1, double side2, double side3) throws IllegalTriangleException{
        super();
        if(!isLegal(side1 , side2 , side3)){
            throw new IllegalTriangleException(side1 , side2 , side3);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    private boolean isLegal(double side1 , double side2 , double side3){
        if ((side1 + side2 < side3) || (side2 + side3 < side1) || (side1 + side3 < side2) || (side1 == 0 || side2 == 0 || side3 == 0)) {
            return false;
        }
        return true;
    }
}
