package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_15 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		char ch = input.next().charAt(0);
		ch = Character.toUpperCase(ch);
		
		int numberofLetter = ((int)ch) % 65;
		
		if(numberofLetter / 3 >= 0 && numberofLetter / 3 < 6) {
			
			int line = numberofLetter / 3;
			System.out.println("The corresponding number is " + (line + 2));
		}
		
		
		int number;
		
		if (ch >= 'W') {
			number = 9 ;
		System.out.println("The corresponding number is " + number);
		}
		else if (ch >= 'T') {
			number = 8;
		System.out.println("The corresponding number is " + number);
		}
		else if (ch >= 'P') {
			number = 7;
		System.out.println("The corresponding number is " + number);
		}
		
		if(ch < 'A' || ch > 'Z')
			System.out.println("Invalid input !");
		
		
		
	}

}
