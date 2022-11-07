package chapters.chapter_10;

public class MyPoint {

    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(MyPoint myPoint){
        return Math.sqrt(Math.pow(this.x - myPoint.getX(), 2) + Math.pow(this.y - myPoint.getY(), 2));
    }
    public double distance(int x , int y){
        return distance(new MyPoint(x , y));
    }

}
