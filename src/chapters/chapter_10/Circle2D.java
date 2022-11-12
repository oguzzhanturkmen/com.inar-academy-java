package chapters.chapter_10;

public class Circle2D {

    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
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
    public boolean contains(Circle2D c) {
        return getDistance(c.getX(), c.getY()) <= getRadius();
    }

    public boolean overlaps(Circle2D circle) {
        return getDistance(circle) <= (getRadius() + circle.getRadius());
    }

    public double getDistance(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - getX(), 2) + Math.pow(circle.getY() - getY(), 2));
    }

    public double getDistance(double x, double y) {
        return Math.sqrt(Math.pow(x - getX(), 2) + Math.pow(y - getY(), 2));

    }
}
