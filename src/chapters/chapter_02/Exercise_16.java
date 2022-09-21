package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_16 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		double area;
		double side;
		
		System.out.println("Enter the side: ");
		side = input.nextDouble();
		
		area= (3 * Math.pow(3, 0.5)) * Math.pow(side, 2) /2 ;
		System.out.println("The area of the hexagon is  " + (int)(area * 10000) / 10000.0);

		
		
		
	}

}
