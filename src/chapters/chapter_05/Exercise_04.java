package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_04 {
	public static void main(String[] args) {
		
		
		System.out.println("Miles \t Kilometers");
		
		for(int i = 1 ; i< 11 ; i++) {
			System.out.printf("%d \t %.3f \n" , i , i * 1.609);
		}
	}

}
