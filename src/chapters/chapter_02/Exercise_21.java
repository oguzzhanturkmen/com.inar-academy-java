package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_21 {
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			double investmentAmount;
			double percentage;
			int years;
			double accumulatedValue;
			
			System.out.println("Enter investment amount: ");
			investmentAmount =  input.nextDouble();
			
			System.out.println("Enter annual interest rate in percentage: ");
			percentage = input.nextDouble();
			percentage /= 1200;
			
			System.out.println("Enter number of years: ");
			years = input.nextInt();
			
			
			accumulatedValue = investmentAmount * Math.pow(1 + percentage , years * 12);
			
			System.out.println("Accumulated value is $" + (int)(accumulatedValue * 100) /100.0);
		
	}

}
