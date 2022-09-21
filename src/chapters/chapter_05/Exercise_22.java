package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_22 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Loan amount : ");
		double loanAmount = input.nextDouble();
		double balance = loanAmount;
		System.out.println("Number of years : ");
		int numberofYears = input.nextInt();
		System.out.println("Annual interest  rate: ");
		double annualInterestRate = input.nextDouble() ;
		double monthlyInterest = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterest
				/ (1 - 1 / Math.pow(1 + monthlyInterest, numberofYears * 12));
		double totalPayment = monthlyPayment * numberofYears * 12;
		System.out.println("Monthly Payment " + monthlyPayment);
		System.out.println("Total Paayment\n " + totalPayment);
		
		System.out.printf("%5s%20s%20s%20s\n\n", "Payment#", "Interest", "Principal" , "Balance");
		
		for (int i = 1; i <= numberofYears * 12; i++) {
			double interest = monthlyInterest * balance;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%-5d%20.2f%20.2f%23.2f \n" , i , interest , principal , balance);
			}

	}

}
