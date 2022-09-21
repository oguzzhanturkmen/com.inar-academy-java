package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_18 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the weight of the package :");
		double pack = input.nextDouble();

		if (pack <= 1 && pack > 0)
			System.out.println("Cost is $" + (3.5 * pack));
		if (pack <= 3 && pack > 1) 
			System.out.println("Cost is $" + (5.5 * pack));
		if(pack <= 10 && pack > 3) 
			System.out.println("Cost is $" + (8.5 * pack));
		if(pack <= 20 && pack > 10) 
			System.out.println("Cost is $" + (10.5 * pack));
		if(pack > 50)
			System.out.println("The package can not be shipped.");

		

	}

}
