package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_47 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first 12 digits of an ISBN-13 as a string: : ");
		String isbn = input.next();
		int checksum = 0;
		
		if(isbn.length() != 12) {
			System.out.println("Invalid input");
			System.exit(1);
		}
		for(int i = 0; i < 12; i++ ) {
			if(i % 2 == 0) {
				checksum += Integer.parseInt(isbn.charAt(i) + "");
			}
			if(i % 2 == 1) {
				checksum += Integer.parseInt(isbn.charAt(i) + "") * 3;
		}
	}
		checksum =( 10 - (checksum % 10));
		
		if(checksum == 10) {
			System.out.println(isbn + "0");
		}
		else {
			System.out.println(isbn + checksum );
		}
	}
}
