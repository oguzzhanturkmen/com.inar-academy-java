package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length from the center to a vertex: ");
		double length = input.nextDouble();
		
		double lengthofSide = 2 * length * Math.sin(Math.PI / 5);
		
		double area = (5 * Math.pow(lengthofSide, 2)) / (4 * Math.tan(Math.PI / 5) );
		
		System.out.printf("The area of the pentagon is %2.2f" , area);
		
		
		
	}
	
	
	


}
