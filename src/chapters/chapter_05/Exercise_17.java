package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_17 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int number = input.nextInt();
		
		for(int i = 1; i < number + 1; i++) {
			
			for(int j = 0; j < number - i; j++) {
				System.out.print("   ");
			}
			for(int k = i; k > 0; k--) {
				System.out.print(k + "  ");
			}
			for(int l = 2; l < i + 1; l++) {
				System.out.print(l + "  ");
			}
			System.out.println();
		}
	}

}
