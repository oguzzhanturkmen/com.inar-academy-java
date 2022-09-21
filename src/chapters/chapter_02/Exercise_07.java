package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_07 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int minutes ;
		int years;
		int days;
	
		
		System.out.println("Enter the number of minutes ; ");
		minutes = input.nextInt();
		
		years = minutes / 60 / 24 / 365;
		days = minutes / 60 / 24 % 365 ;
		
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days" );
		
		
	}

}
