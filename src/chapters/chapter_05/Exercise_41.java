package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_41 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter numbers : ");
		int max = 0;
		int count = 1;
		int number;
		do {
			number = input.nextInt();

			if (number >= max) {
				if (number > max) {
					max = number;
					count = 1;
				} else if (number == max) {
					count++;
				}
			}

		} while (number != 0);
		System.out.println("Largest number is " + max + "\nThe occurence count is : " + count);
	}
}
