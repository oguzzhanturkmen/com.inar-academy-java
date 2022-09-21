package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_09 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		char  ch = input.next().charAt(0);
		
		byte unicode = (byte)ch;
		
		System.out.println("The Unicode for the character " + ch + " is " + unicode);
	}

}
