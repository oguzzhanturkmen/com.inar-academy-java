package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_32 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery pick (two digits): ");
		int guess1 = input.nextInt();
		int guess2 = input.nextInt();
		boolean isDifferent = true;
		int lotteryDigit1 = (int) (Math.random() * 11);
		int lotteryDigit2 = (int) (Math.random() * 11);
		if (lotteryDigit1 == lotteryDigit2) {
			while (isDifferent) {
				lotteryDigit2 = (int) Math.random() * 11;
				if (lotteryDigit1 != lotteryDigit2) {
					isDifferent = false;
					break;
				}
			}
		}

		System.out.println("The lottery number is " + lotteryDigit1 + lotteryDigit2);
		if (guess1 == lotteryDigit1 && guess2 == lotteryDigit2)
			System.out.println("Exact match: you win $10,000");
		else if (guess2 == lotteryDigit1 && guess2 == lotteryDigit2)
			System.out.println("Match all digits: you win $3,000");
		else if (guess1 == lotteryDigit1 || guess1 == lotteryDigit2 || guess2 == lotteryDigit1
				|| guess2 == lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");
	}

}
