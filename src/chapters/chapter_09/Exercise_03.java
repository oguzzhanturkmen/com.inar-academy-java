package chapters.chapter_09;

import java.util.Date;

public class Exercise_03 {
    public static void main(String[] args) {

        Date date = new Date();
        long time = 10000;
        for (int i = 1; i < 9; i++) {
            date.setTime(time);
            System.out.println(date.toString());
            time *= 10;



        }
    }
}
