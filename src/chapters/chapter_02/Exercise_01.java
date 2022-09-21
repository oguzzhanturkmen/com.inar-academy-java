package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double degree;
		
		System.out.println("Enter a degree in Celsius : ");
		degree = input.nextDouble();
		
		System.out.println(degree + " Celsius is " + ((9.0/5) * degree + 32 ) + " Fahrenheit");
	 
	}

}
