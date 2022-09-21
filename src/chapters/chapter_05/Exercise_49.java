package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_49 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string:" ); 
		String str = input.nextLine().replaceAll(" " , "");
		int vovelCount = 0;
		int consonantCount = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
				vovelCount++;
			}
			else {
				consonantCount++;
			}
		}
		System.out.println("The number of vowels is " + vovelCount );
		System.out.println("The number of consonants is " + consonantCount);
	}

}
