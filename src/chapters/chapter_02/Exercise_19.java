package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_19 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double x1 , y1 ;
		double x2 , y2 ;
		double x3 , y3 ;
		double area;
		double s;
		double side1;
		double side2;
		double side3;
		
		System.out.println("Enter three points for a triangle: ");
		x1  = input.nextDouble();
		y1  = input.nextDouble();
		x2  = input.nextDouble();
		y2  = input.nextDouble();
		x3  = input.nextDouble();
		y3  = input.nextDouble();
		
		side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5); 
		
		s = (side1 + side2 + side3) / 2;
		
		area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		
		System.out.println("The area of the triangle is " + (int)(area * 10) /10.0);
		
	}

}
