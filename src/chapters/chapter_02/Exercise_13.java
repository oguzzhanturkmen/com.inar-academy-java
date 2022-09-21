package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_13 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double rate = 1 + 0.00417;
		double amount;
		double value;
		
		System.out.println("Enter the monthly saving amount: ");
		amount = input.nextDouble();
		
		value = amount * rate ;
		value = (value + amount) * rate ;
		value = (value + amount) * rate ;
		value = (value + amount) * rate ;
		value = (value + amount) * rate ;
		value = (value + amount) * rate ;
		System.out.println("After the sixth month, the account value is " + (int)(value * 100) / 100.0);
		
	}

}
