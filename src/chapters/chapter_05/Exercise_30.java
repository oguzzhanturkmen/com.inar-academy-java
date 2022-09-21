package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_30 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the amount : ");
		double amount = input.nextDouble();

		System.out.println("Enter the annual interest rate :");
		double interestRate = input.nextDouble();

		System.out.println("Enter the number of months : ");
		int numberofMonths = input.nextInt();

		double monthlyInterestRate = (interestRate / 12);
		double savingValue = 0;

		for (int i = 0; i < numberofMonths; i++) {
			savingValue = (savingValue + amount) * (1 + monthlyInterestRate);
		}
		System.out.printf("%.2f", savingValue);
	}

}
