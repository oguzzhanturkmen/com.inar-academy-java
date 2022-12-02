package chapters.chapter_13;


import java.util.Date;

public class Square extends GeometricObjectAbstract implements Colorable {

    private double side1 ;
    private double side2 ;

    public Square(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Square(String color, boolean filled, double side1, double side2) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
    }

    public Square(String color, boolean filled) {
        super(color, filled);
        side1 = 0;
        side2 = 0;
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
    public double getArea(){
        return side1 * side2;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public Date getDateCreated() {
        return super.getDateCreated();
    }
    public String howToColor(){
        return "Color all four sides ";
    }
}
