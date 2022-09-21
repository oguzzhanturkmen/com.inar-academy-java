package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_21 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter year: ");
		int year = input.nextInt();

		System.out.println("Enter month: ");
		int m = input.nextInt();

		System.out.println("Enter the day of the month : ");
		int q = input.nextInt();

		if (m == 1 || m == 2) {
			m = (m == 1) ? 13 : 14;
			year--;
		}

		int j = year / 100;
		int k = year % 100;

		int dayofWeek = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

		System.out.print("Day of week is ");

		switch (dayofWeek) {
		case 0:
			System.out.println("Saturday");
			break;
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		}
	}

}
