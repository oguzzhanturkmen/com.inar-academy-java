package chapters.chapter_13;

public class Exercise_05 {
    public static void main(String[] args) {
        CircleGeometric c1 = new CircleGeometric(2 , 3 , 3);
        CircleGeometric c2 = new CircleGeometric(4 , 5 , 7);

        System.out.println(GeometricObjectComparable.max(c1 , c2));
    }
}
