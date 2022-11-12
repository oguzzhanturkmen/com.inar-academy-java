package chapters.chapter_10;

public class Exercise_14 {
    public static void main(String[] args) {

        MyDate d1 = new MyDate();
        MyDate d2 = new MyDate(34355555133101L);

        System.out.println(d1.getDay() + "," + d1.getMonth() + "," + d1.getYear());
        System.out.println(d2.getDay() + "," + d2.getMonth() + "," + d2.getYear());
    }
}
