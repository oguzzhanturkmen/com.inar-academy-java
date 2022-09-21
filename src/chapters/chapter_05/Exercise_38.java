package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int number = input.nextInt();

		String octal = "";

		while (number != 0) {
			octal = (number % 8) + octal;
			number /= 8;
		}
		System.out.println(octal);
	}

}
