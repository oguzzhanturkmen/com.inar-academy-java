package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_51 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first string: ");
		String str1 = input.nextLine();

		System.out.println("Enter the second string: ");
		String str2 = input.nextLine();

		if (str1.length() > str2.length()) {
			String temp = str1;
			str1 = str2;
			str2 = temp;
		}
		int prefixCount = 0;

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == str2.charAt(i)) {
				prefixCount++;
				continue;
			}
			break;
		}
		if (prefixCount == 0) {
			System.out.println("No common prefix ");
		} else {
			System.out.print("The common prefix is ");
			for (int i = 0; i < prefixCount; i++) {
				System.out.print(str1.charAt(i));
			}
		}
	}

}
