package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_09 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double averageAcceleration;
		double startVelocity;
		double endVelocity;
		double time;
		
		System.out.println("Enter v0, v1 and t: ");
		startVelocity = input.nextDouble();
		endVelocity = input.nextDouble();
		time = input.nextDouble();
		
		averageAcceleration = (endVelocity - startVelocity) / time ;
		
		System.out.println("The average acceleration is " + (int)(averageAcceleration *10000 ) / 10000.0);
		
	}

}
