package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_04 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double POUND = 0.454 ;
		double value ;
		
		System.out.println("Enter a number in pounds: ");
		value = input.nextDouble();
		
		System.out.println(value + " pounds is " + value * POUND + " kilograms " );
		
	}

}
