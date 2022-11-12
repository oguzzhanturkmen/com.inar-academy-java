package chapters.chapter_10;

public class Exercise_04 {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 3.5);

        System.out.println(point1.distance(point2));
    }
}
