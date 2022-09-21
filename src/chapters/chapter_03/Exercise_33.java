package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_33 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight and price for package 1: ");
		double package1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		System.out.println("Enter weight and price for package 2: ");
		double package2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		if(package1 / price1 > package2 / price2)
			System.out.println("Package 2 has a better price");
		if(package1 / price1 < package2 / price2)
			System.out.println("Package 2 has a better price");
		else
			System.out.println("Two packages have the same price. ");
	}

}
