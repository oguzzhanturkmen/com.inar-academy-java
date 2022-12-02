package chapters.chapter_13;

public class Exercise_06 {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(2 , 3 , 3);
        ComparableCircle c2 = new ComparableCircle(4 , 5 , 7);

        System.out.println(c1.compareTo(c2));
    }
}
