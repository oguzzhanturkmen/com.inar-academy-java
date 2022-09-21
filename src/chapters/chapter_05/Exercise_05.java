package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {
		
		System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");
		
		for(int i = 1 , j = 20 ; i < 200 && j < 516 ; i = i + 3 ,j = j + 5) {
			System.out.printf("%8d  %12.2f  |  %11d  %9.2f\n" , i , i * 2.2 , j , j / 2.2);
			
			
		}
	}

}
