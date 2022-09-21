package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_20 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = input.next();
		
		System.out.println("First character is : " + str.charAt(0) + "\nLength is : " + str.length());
	}

}
