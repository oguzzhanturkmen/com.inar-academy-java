package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_23 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double distance;
		double miles;
		double price;
		double cost;
		
		System.out.print("Enter the driving distance: ");
		distance = input.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		miles = input.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		price = input.nextDouble();
		
		cost = (distance /  miles) * price;
		System.out.print("The cost of driving is $" + (int)(cost *100) / 100.0);
	}

}
