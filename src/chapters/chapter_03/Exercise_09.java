package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_09 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first 9 digits of an ISBN as integer : ");
		
		int number = input.nextInt();
		final int isbn = number;
		
		int checksum = 0;
		
		checksum += number / 100000000;
		number %= 100000000;
		
		checksum += number / 10000000 * 2;
		number %= 10000000;
		
		checksum += number / 1000000 * 3;
		number %= 1000000;
		
		checksum += number / 100000 * 4;
		number %= 100000;
		
		checksum += number / 10000 * 5;
		number %= 10000;
		
		checksum += number / 1000 * 6;
		number %= 1000;
		
		checksum += number / 100 * 7;
		number %= 100;
		
		checksum += number / 10 * 8;
		number %= 10;
		
		checksum += number  * 9;
		
		if(checksum % 11 == 10) {
			System.out.println(isbn + "X");
		}
		else {
			System.out.println(isbn + "" + checksum % 11);
		}
	}
}
