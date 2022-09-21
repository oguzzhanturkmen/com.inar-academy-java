package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_06 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int value ;
		int sum = 0 ;
		
		System.out.println("Enter a number between 0 and 1000: ");
		value = input.nextInt();
		
		sum += value % 10 ;
		value = value / 10;
		sum += value % 10 ;
		value = value /10 ;
		sum += value % 10 ;
		value = value /10 ;
		sum += value % 10 ;
		value = value /10 ;
		
		System.out.println("The sum of the digits is " + sum);
	}

}
