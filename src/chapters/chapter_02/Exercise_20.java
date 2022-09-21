package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_20 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double balance;
		double interestRate;
		double interest;
		
		System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
		balance = input.nextDouble();
		interestRate = input.nextDouble();
		
		interest = balance * (interestRate /1200);
		
		System.out.println("The interest is " + (int)(interest * 10000) / 10000.0);
	}

}
