package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_23 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee's name:");
		String name = input.next();
		
		System.out.println("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		
		System.out.println("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.println("Enter federal tax withholding rate: ");
		double federalTax = input.nextDouble();
		
		System.out.println("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours worked" + hoursWorked);
		System.out.println("Pay rate $" + payRate);
		System.out.println("Gross Pay: $" + hoursWorked * payRate);
		System.out.println("Deductions:");
		System.out.println("\tFederal Withholding (20.0%): $" + (hoursWorked * payRate * federalTax));
		System.out.println("\tState Withholding ( " + (stateTax * 100) + "% )" + (hoursWorked * payRate * stateTax));
		System.out.println("\tTotal Deduction: $" + (hoursWorked * payRate * federalTax) + (hoursWorked * payRate * stateTax));
		System.out.println("Net pay: $" + ((hoursWorked * payRate) - (hoursWorked * payRate * federalTax) + (hoursWorked * payRate * stateTax)));
		
		//Total Deducation and Net Pay = ????
		
	}

}
