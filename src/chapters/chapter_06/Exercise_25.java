package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter milliseconds : ");
        long millisec = input.nextLong();

        System.out.println(convertMillis(millisec));

    }
    public static String convertMillis(long milliSeconds){
        long totalSeconds = milliSeconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        String conversion = totalHours + ":" + totalMinutes % 60 + ":" + totalSeconds % 60;
        return conversion;
    }
}
