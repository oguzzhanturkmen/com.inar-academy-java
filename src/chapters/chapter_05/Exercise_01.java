package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int negatives = 0;
		int positives = 0;
		double average;
		int number;
		double sum = 0;
		System.out.println("Enter an integer, the input ends if it is 0:");
		do {
			number = input.nextInt();
			if(number < 0)
				negatives++;
			else if (number > 0)
				positives++;
			
			sum += number;
			average = (sum / (positives + negatives));
			
		
		}while(number != 0);
		
		System.out.println("The number of positives is " + positives);
		System.out.println("The number of negatives is " + negatives);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + average);
	}

}
