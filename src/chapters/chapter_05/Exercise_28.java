package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_28 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the year and the first day of the year: ( 0 for Sunday) ");
		int year = input.nextInt();
		int day = input.nextInt();
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		for (int i = 2; i < 13; i++) {
			if (i < 9) {
				if (i % 2 == 0) {

					day = (day + 31) % 7;
				}
				if (i % 2 == 1) {
					if (i == 3) {
						if (isLeapYear) {
							day = (day + 29) % 7;
						}
						if (!isLeapYear) {
							day = (day + 28) % 7;
						}
					} else {
						day = (day + 30) % 7;
					}
				}
			}
			if (i > 8) {
				if (i % 2 == 0) {
					day = (day + 30) % 7;
				}
				if (i % 2 == 1) {
					day = (day + 31) % 7;
				}
			}
			switch (i) {
			case 2:
				System.out.print("February 1 , " + year + " is ");
				break;
			case 3:
				System.out.print("March 1 , " + year + " is ");
				break;
			case 4:
				System.out.print("April 1 , " + year + " is ");
				break;
			case 5:
				System.out.print("May 1 , " + year + " is ");
				break;
			case 6:
				System.out.print("June 1 , " + year + " is ");
				break;
			case 7:
				System.out.print("July 1 , " + year + " is ");
				break;
			case 8:
				System.out.print("August 1 , " + year + " is ");
				break;
			case 9:
				System.out.print("September 1 , " + year + " is ");
				break;
			case 10:
				System.out.print("October 1 , " + year + " is ");
				break;
			case 11:
				System.out.print("November 1 , " + year + " is ");
				break;
			case 12:
				System.out.print("December 1 , " + year + " is ");
				break;
			}
			switch (day) {
			case 0:
				System.out.print("Monday");
				break;
			case 1:
				System.out.print("Tuesday");
				break;
			case 2:
				System.out.print("Wednesday");
				break;
			case 3:
				System.out.print("Thursday");
				break;
			case 4:
				System.out.print("Friday");
				break;
			case 5:
				System.out.print("Saturday");
				break;
			case 6:
				System.out.print("Sunday");
				break;

			}
			System.out.println();
		}
	}
}
