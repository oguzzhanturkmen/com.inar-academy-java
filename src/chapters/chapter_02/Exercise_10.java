package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_10 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double weightoffWater ;
		double initialTemperature;
		double finalTemprature;
		double energy;
		
		System.out.println("Enter the amount of water in kilograms: ");
		weightoffWater = input.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		initialTemperature = input.nextDouble();
		
		System.out.println("Enter the final temperature: ");
		finalTemprature = input.nextDouble();
		
		energy = weightoffWater * (finalTemprature - initialTemperature) *4184;
		energy = (int)(energy *10) / 10.0;
		
		System.out.println("The energy needed is " + energy);
		
	
		
		
	}

}
