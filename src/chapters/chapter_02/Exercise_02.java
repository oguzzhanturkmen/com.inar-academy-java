package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		
		final double PI = 3.14 ;
		double radius ;
		double length ;
		double area ;
		
		System.out.println("Enter the radius and length of a cylinder: ");
		radius = input.nextDouble();
		length = input.nextDouble();
		area = radius * radius * PI;
	
		System.out.println("The area is " + area );
		
		System.out.println("The volume is " + area * length);
		
	}

}
