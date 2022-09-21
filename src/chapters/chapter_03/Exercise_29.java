package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_29 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();
		
		System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();
		
		if (Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) , 0.5) + radius2 < radius1)
			System.out.println("circle2 is inside circle1");
		else if (Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) , 0.5) < radius1 + radius2  )
				System.out.println("circle2 overlaps circle1");
		else
			System.out.println("circle2 does not overlap circle1");
		
			
			
	}

}
