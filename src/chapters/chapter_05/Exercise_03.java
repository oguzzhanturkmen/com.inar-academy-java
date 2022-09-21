package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kilograms /t Pounds");
		
		for(int i = 1 ; i < 200 ; i = i + 2) {
			System.out.printf("%d \t %.1f \n ", i , i * 2.2);
		}
	}

}
