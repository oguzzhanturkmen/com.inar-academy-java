package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_08 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
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
		
		System.out.println("The current time is " + (currentHour + gmt) + ":" + currentMinute + ":" +  currentSecond );
		
	}

}
