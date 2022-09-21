package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_06 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double RADIUS = 40;
		
		double angle1 = (Math.random() * (2 * Math.PI));
		double angle2 = (Math.random() * (2 * Math.PI));
		double angle3 = (Math.random() * (2 * Math.PI));
		
		double x1 = RADIUS * Math.cos(angle1);
		double y1 = RADIUS * Math.sin(angle1);
		double x2 = RADIUS * Math.cos(angle2);
		double y2 = RADIUS * Math.sin(angle2);
		double x3 = RADIUS * Math.cos(angle3);
		double y3 = RADIUS * Math.sin(angle3);
		
		System.out.println("x1 y1 is " + x1 + " " + y1   );
		System.out.println("x2 y2 is " + x2 + " " + y2   );
		System.out.println("x3 y3 is " + x3 + " " + y3   );
	}

}
