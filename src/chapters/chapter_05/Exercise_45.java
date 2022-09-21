package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_45 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter ten numbers:");
		double sumMean = 0;
		double sumDeviation = 0;
		for(int i = 0; i < 10 ; i++) {
			double number = input.nextDouble();
			sumMean += number;
			sumDeviation += (Math.pow(number, 2));
		}
		double mean = sumMean / 10;
		double deviation = Math.sqrt((sumDeviation  - (Math.pow(sumMean, 2) / 10)) / 9 ) ;
		System.out.println("The mean is " + mean);
		System.out.println("The deviation is " + deviation);
		
	}
}
