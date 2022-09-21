package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a, b , c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		
		if(Math.pow(b, 2) - 4 * a * c > 0) {
			double root1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c , 0.5)) / (2 * a);
			double root2 = (-b - Math.pow(Math.pow(b, 2) - 4 * a * c , 0.5)) / (2 * a);
			System.out.println("The equation has two roots" + root1 + " " + root2);
		}
		else if(Math.pow(b, 2) - 4 * a * c == 0) {
			double root1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c , 0.5)) / (2 * a);
			System.out.println("The equation has one roots " + root1);
		}
		else {
			System.out.println("The equation has no roots");
		}
		
	}

}
