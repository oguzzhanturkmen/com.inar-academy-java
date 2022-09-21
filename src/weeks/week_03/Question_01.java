package weeks.week_03;

import java.util.Scanner;

public class Question_01 {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter your salary: ");
	double salary = input.nextDouble();
	
	System.out.println("Enter your year of service : ");
	int yearofService = input.nextInt();
	
	if(yearofService > 5 ) {
		double bonus = salary * (5.0 / 100.0) ;
		salary += bonus ;
		System.out.println("Bonus amount is " + bonus);
	}
	
	System.out.println("Your salary is :" + salary);
	
	
	}
}
