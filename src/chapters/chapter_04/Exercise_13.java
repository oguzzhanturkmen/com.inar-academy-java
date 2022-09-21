package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_13 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		char ch = input.next().charAt(0);
		Character.toLowerCase(ch);
		
		if(Character.isLetter(ch)) {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				System.out.println(ch + " is a vowel");
			else
				System.out.println(ch + " is a consonant ");
		}
		else
			System.out.println("Invalid input !");
			
				
		
		
			
		
		
	}

}
