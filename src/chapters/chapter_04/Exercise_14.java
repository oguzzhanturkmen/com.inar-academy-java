package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter grade: ");
		char ch = input.next().charAt(0);
		ch = Character.toUpperCase(ch);
		
		if(ch >= 'A' && ch <= 'F')
			System.out.println("The numeric value for grade " + Math.abs((int)(ch - 'F')));
		else
			System.out.println(ch + " is an invalid grade");
		
		
		
	}

}
