package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_21 {
	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		System.out.println("Loan amount : ");
		double loanAmount = input.nextDouble();
		System.out.println("Number of years : ");
		int numberofYears = input.nextInt();
		double interestRate = 5 / 100;
		System.out.printf("%5s%20s%20s\n\n", "Interest Rate", "Monthly Payment", "Total Payment");

		for (double i = 5.0; i <= 8.0; i += 0.125) {
			double monthlyInterest = i / 1200;
			double monthlyPayment = loanAmount * monthlyInterest
					/ (1 - 1 / Math.pow(1 + monthlyInterest, numberofYears * 12));
			double totalPayment = monthlyPayment * numberofYears * 12;
			System.out.printf("%-5.3f%19.2f%24.2f\n" , i , monthlyPayment , totalPayment);

		}
	}

}
