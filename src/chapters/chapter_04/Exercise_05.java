package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of sides: ");
		int numberofSides = input.nextInt();
		
		System.out.println("Enter the side: ");
		double sideLength = input.nextDouble();
		
		double area = (numberofSides * Math.pow(sideLength, 2) / (4 * Math.tan(Math.PI / numberofSides)));
		
		System.out.println("The area of the polygon is " + area);
	}

}
