package chapters.chapter_13;

public class CircleGeometric extends GeometricObjectComparable{

    private double x;
    private double y;
    private double radius;

    public CircleGeometric() {
        this(0, 0, 1);
    }

    public CircleGeometric(double x, double y, double radius) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getPerimeter() {
        return Math.PI * 2 * getRadius();
    }

    public boolean contains(double x, double y) {
        return getDistance(x, y) <= getRadius();
    }
    public boolean contains(CircleGeometric c) {
        return getDistance(c.getX(), c.getY()) <= getRadius();
    }

    public boolean overlaps(CircleGeometric circle) {
        return getDistance(circle) <= (getRadius() + circle.getRadius());
    }

    public double getDistance(CircleGeometric circle) {
        return Math.sqrt(Math.pow(circle.getX() - getX(), 2) + Math.pow(circle.getY() - getY(), 2));
    }

    public double getDistance(double x, double y) {
        return Math.sqrt(Math.pow(x - getX(), 2) + Math.pow(y - getY(), 2));

    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }
}
