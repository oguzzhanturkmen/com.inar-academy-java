package chapters.chapter_10;

public class Traingle2D {

    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Traingle2D() {
        this(new MyPoint(0 , 0) , new MyPoint(1 , 1), new MyPoint(2 , 5));
    }

    public Traingle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }
    public double getArea(){
        double s =  p1.distance(getP2()) + p1.distance(getP3()) + p2.distance(getP3());


        return Math.pow(s * (s - p1.distance(getP2()) * (s  -  p1.distance(getP2()) * (p2.distance(getP3())))) , 0.5);
    }
    public double getPerimeter(){
        return p1.distance(getP2()) + p1.distance(getP3()) + p2.distance(getP3());
    }
    public boolean contains(MyPoint p) {
        return (getArea() == new Traingle2D(p1, p, p2).getArea() + new Traingle2D(p2, p, p3).getArea() + new Traingle2D(p1, p, p3).getArea());
    }

    public boolean contains(Traingle2D triangle2D) {
        return (contains(triangle2D.getP1()) && contains(triangle2D.getP2()) && contains(triangle2D.getP3()));
    }

    public boolean overLaps(Traingle2D triangle2D) {
        return (contains(triangle2D.getP1()) || contains(triangle2D.getP2()) || contains(triangle2D.getP3()));
    }
}
