package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double KILOGRAM = 0.45359237;
		final double INCH = 0.0254;
		
		double weight;
		double height;
		double bmi;
		
		System.out.println("Enter weight in pounds: ");
		weight = input.nextDouble();
		weight *= KILOGRAM;
		
		System.out.println("Enter the height in inches: ");
		height = input.nextDouble();
		height *= INCH;
		
		bmi = weight / (Math.pow(height, 2));
		
		System.out.println("BMI is " + (int)(bmi * 10000) /10000.0);
		
		
		
	}

}
