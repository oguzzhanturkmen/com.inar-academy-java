package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_50 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str = input.nextLine().replaceAll(" ", "");
		int caseCount = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i)  <= 'Z') {
				caseCount++;
			}
		}
		System.out.println("Number of uppercase letters is : " + caseCount);
	}

}
