package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_12 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double acceleration;
		double takeoffSpeed;
		double runwayLength;
		
		System.out.println("Enter spped and acceleration: ");
		takeoffSpeed = input.nextDouble();
		acceleration = input.nextDouble();
		
		runwayLength = (Math.pow(takeoffSpeed, 2)) / (2 * acceleration);
		
		System.out.println("The minimum runway length for this airplane is " + (int)(runwayLength * 1000) /1000.0);
	}

}
