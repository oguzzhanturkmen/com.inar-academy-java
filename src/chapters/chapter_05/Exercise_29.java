package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_29 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the year and the first day of the year ( 0 for monday and 6 for sunday ): ");
		int year = input.nextInt();
		int day = input.nextInt();
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		int dayNumber;

		for (int i = 1; i < 13; i++) {

			switch (i) {
			case 1:System.out.printf("\n%20s %5s \n", "January" , year);break;
			case 2:System.out.printf("\n%20s %5s\n", "February" , year);break;
			case 3:System.out.printf("\n%20s %5s\n", "March", year);break;
			case 4:System.out.printf("\n%20s %5s\n", "April", year);break;
			case 5:System.out.printf("\n%20s %5s\n", "May" , year);break;
			case 6:System.out.printf("\n%20s %5s\n", "June", year);break;
			case 7:System.out.printf("\n%20s %5s\n", "July", year);break;
			case 8:System.out.printf("\n%20s %5s\n", "August", year);break;
			case 9:System.out.printf("\n%20s %5s\n", "Septmeber", year);break;
			case 10:System.out.printf("\n%20s %5s\n", "Septmeber", year);break;
			case 11:System.out.printf("\n%20s %5s\n", "November", year);break;
			case 12:System.out.printf("\n%20s %5s\n", "December", year);break;
			}
			for(int j = 0; j < 40; j++) {
				System.out.print("-");
			}
			
			System.out.printf("\n%-6s%-6s%-6s%-6s%-6s%-6s%-6s\n" , "Mon" ,  "Tue" , "Wed" , "Thu" , "Fri" , "Sat" , "Sun" );
			
			if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				dayNumber = 31;
			}
			else if ( i == 2) {
				if(isLeapYear) {
					dayNumber = 29;
				}
				else {
					dayNumber = 28;
				}
			}
			else {
				dayNumber = 30;
			}
			for(int k = day; k > 0; k--) {
				System.out.printf("%6s" , " ");
			}
			for(int x = 1; x <= dayNumber; x++) {
				System.out.printf("%-5s " , x);
				if((x + day)  % 7 == 0) {
					System.out.println();
				}
			}
			day = (day + dayNumber) % 7;
			System.out.println();
		}

	}
}

