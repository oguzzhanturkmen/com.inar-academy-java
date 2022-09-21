package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_11 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double year_in_second = 365 * 24 * 60 * 60 ;
		double death= year_in_second /13;
		double birth= year_in_second / 7;
		double new_immigrant = year_in_second / 45;
		double population = 312032486 ;
		int year;

		System.out.println("Enter the number of years: ");
		year = input.nextInt();
		
		System.out.println("The population in " + year + " year is " + (int)((population + ((birth + new_immigrant- death) * year))));
		
		
	}
}
