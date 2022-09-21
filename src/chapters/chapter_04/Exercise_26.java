package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_26 {
	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);

		System.out.print(
		"Enter an amount in double, for example 11.56: ");
		String strAmount = input.next();
		int comma = strAmount.indexOf(",");
		int amount = Integer.parseInt(strAmount.substring(0 , comma));
		int remainingAmount = Integer.parseInt(strAmount.substring(comma + 1));
		
		

		int numberOfOneDollars = amount;
		remainingAmount = remainingAmount % 100;

		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		int numberOfPennies = remainingAmount;

		System.out.println("Your amount " + strAmount + " consists of");
		if(numberOfOneDollars <= 1) {
			System.out.println(" " + numberOfOneDollars + " dollar");
		}
		else {
			System.out.println(" " + numberOfOneDollars + " dollars");
		}
		
		if(numberOfQuarters <= 1) {
			System.out.println(" " + numberOfQuarters + " quarter");
		}
		else {
			System.out.println(" " + numberOfQuarters + " quarters ");
		}
		
		if(numberOfDimes <= 1) {
			System.out.println(" " + numberOfDimes + " dime");
		}
		else {
			System.out.println(" " + numberOfDimes + " dimes ");
		}
		
		if(numberOfNickels <= 1) {
			System.out.println(" " + numberOfNickels + " nickel");
		}
		else {
			System.out.println(" " + numberOfNickels + " nickels");	
		}
		
		if(numberOfPennies <= 1) {
			System.out.println(" " + numberOfPennies + " pennie");
		}
		else {
			System.out.println(" " + numberOfPennies + " pennies");	
		}
			
		
		
}
}
