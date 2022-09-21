package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_17 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a year : ");
		int year = input.nextInt();
		input.skip("\\r");
		
		System.out.println("Enter a month");
		String month = input.nextLine().trim().toLowerCase();
		
		boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		switch (month){
		
		case "jan" :
		case "mar" :
		case "may" :
		case "jul" :
		case "aug" :
		case "oct" : System.out.println((month.substring(0 , 1).toUpperCase() + month.substring(1)) + " " + year + " has 31 days."); break;
		case "apr" :
		case "jun" :
		case "sep" :
		case "nov" :
		case "dec" : System.out.println((month.substring(0 , 1).toUpperCase() + month.substring(1)) + " " + year + " has 30 days."); break;
		case "feb" : System.out.println((month.substring(0 , 1).toUpperCase() + month.substring(1)) + " " + year + " has " +(leapYear ?
				 " 29 " : " 28 " ) + " days"); break;
		}
		
		
	}

}
