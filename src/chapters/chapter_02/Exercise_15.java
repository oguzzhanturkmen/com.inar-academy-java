package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_15 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double x1;
		double y1;
		double x2;
		double y2;
		double distance;
		
		System.out.println("Enter x1 and y1: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		
		System.out.println("Enter x2 and y2: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();

		distance = Math.pow((Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))), 0.5);
		
		System.out.println("The distance between the two points is " + distance);
	}

}
