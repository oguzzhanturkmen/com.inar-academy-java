package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_07 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();
		
		
		
		double x1 = radius * Math.cos(2.0 * Math.PI / 5.0 * 1);
		double y1 = radius * Math.sin(2.0 * Math.PI / 5.0 * 1);
		double x2 = radius * Math.cos(2.0 * Math.PI / 5.0 * 2);
		double y2 = radius * Math.sin(2.0 * Math.PI / 5.0 * 2);
		double x3 = radius * Math.cos(2.0 * Math.PI / 5.0 * 3);
		double y3 = radius * Math.sin(2.0 * Math.PI / 5.0 * 3);
		double x4 = radius * Math.cos(2.0 * Math.PI / 5.0 * 4);
		double y4 = radius * Math.sin(2.0 * Math.PI / 5.0 * 4);
		double x5 = radius * Math.cos(2.0 * Math.PI / 5.0 * 5);
		double y5 = radius * Math.sin(2.0 * Math.PI / 5.0 * 5);
	
		
		System.out.println("x1 y1 is " + x1 + " " + y1 );
		System.out.println("x2 y2 is " + x2 + " " + y2 );
		System.out.println("x3 y3 is " + x3 + " " + y3 );
		System.out.println("x4 y4 is " + x4 + " " + y4 );
		System.out.println("x5 y5 is " + x5 + " " + y5 );
		
	}

}
