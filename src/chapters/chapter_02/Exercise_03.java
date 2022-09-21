package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double FOOT = 0.305 ;
		double value ;
		
		System.out.println("Enter a value for feet: ");
		value = input.nextDouble();
		
		System.out.println(value + " feet is " + value * FOOT + " meters" );
		

	}

}
