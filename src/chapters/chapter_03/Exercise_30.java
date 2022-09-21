package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_30 {
	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		int gmt ;
		System.out.println("Enter the time zone offset to GMT : ");
		gmt = input.nextInt();
		currentHour += gmt;
		

		if (currentHour < 12) {
			currentHour %= 12;

			System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " AM GMT " +gmt);
		} else {
			currentHour %= 12;

			System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " PM GMT" + gmt);
		}
	}

}
