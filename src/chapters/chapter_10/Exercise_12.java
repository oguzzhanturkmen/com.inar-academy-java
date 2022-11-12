package chapters.chapter_10;

public class Exercise_12 {
    public static void main(String[] args) {
        Traingle2D t1 = new Traingle2D(new MyPoint(2.5 , 2) , new MyPoint(4.2 ,3) , new MyPoint(5,3.5));
        System.out.println(t1.contains((new Traingle2D(new MyPoint(2.9 , 2) , new MyPoint(4 ,1) , new MyPoint(1,3.4)))));
    }
}
