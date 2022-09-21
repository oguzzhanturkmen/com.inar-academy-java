package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double rate ;
		double subtotal;
		double gratuity ;
		
		System.out.println("Enter the subtotal and a gratuity rate: ");
		
		subtotal = input.nextDouble();
		rate = input.nextDouble();
		
		gratuity = subtotal / 100 * rate  ;
		System.out.println("The gratuity is $" + gratuity + " and total is $" + ( subtotal + gratuity ));
		
		
	}

}
