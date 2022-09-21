package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int coin = (int)(Math.random() * 2);
		
		System.out.println("Enter your guess: ");
		int guess = input.nextInt();
		
		if(coin == guess) {
			System.out.println("Your guess is correct .");
		}
		else
			System.out.println("Your guess is wrong.");
		
		
	}

}
