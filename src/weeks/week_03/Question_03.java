package weeks.week_03;

import java.util.Scanner;

public class Question_03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a 4 digit number : ");
		int number = input.nextInt();
		
		System.out.print(number % 10);
		System.out.print((number / 10) % 10);
		System.out.print((number / 100) % 10);
		System.out.print(number / 1000);
		
	}

}
