package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_31 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the amount : ");
		double amount = input.nextDouble();

		System.out.println("Enter the annual interest rate :");
		double interestRate = input.nextDouble();

		System.out.println("Enter the number of months : ");
		int numberofMonths = input.nextInt();

		double monthlyInterestRate = (interestRate / 1200);
		System.out.println("Month   CD Value\n");
		for(int i =0 ; i <= numberofMonths; i++) {
			amount+= (amount * monthlyInterestRate); 
			System.out.printf("%-2d%14.2f\n" , i , amount);
		}

	}

}
