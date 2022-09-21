package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter today's day: ");
		int today = input.nextInt();
		
		System.out.println("Enter the number of days elapsed since today :");
		int futureDay = input.nextInt();
		
		System.out.print("Today is ");
		
		switch(today){
			case 1: System.out.print("Monday");
			break;
			case 2: System.out.print("Tuesday");
			break;
			case 3: System.out.print("Wednesday");
			break;
			case 4: System.out.print("Thursday");
			break;
			case 5: System.out.print("Friday");
			break;
			case 6: System.out.print("Saturday");
			break;
			case 7: System.out.print("Sunday");
			break;
		}
		
		System.out.print(" and the future day is ");
		
		switch((futureDay + today)% 7){
		case 1: System.out.print("Monday");
		break;
		case 2: System.out.print("Tuesday");
		break;
		case 3: System.out.print("Wednesday");
		break;
		case 4: System.out.print("Thursday");
		break;
		case 5: System.out.print("Friday");
		break;
		case 6: System.out.print("Saturday");
		break;
		case 7: System.out.print("Sunday");
		break;
		}
	}
	
	
	

}
