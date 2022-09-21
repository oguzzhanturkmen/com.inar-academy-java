package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_08 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an ASCII code: ");
		byte  asciNumber = input.nextByte();
		
		char ch = (char)asciNumber;
		
		System.out.println("The character for ASCII code" + asciNumber + " is " + ch);
	}

}
