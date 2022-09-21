package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_09 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numberofStudents;
		double maxScore = 0;
		double maxScore2 = 0;
		String maxName = "";
		String maxName2 = "";
		System.out.println("Enter the number of students : ");
		numberofStudents = input.nextInt();

		for (int i = 0; i < numberofStudents; i++) {
			System.out.println("Enter the name and the score :");
			String name = input.next();
			double score = input.nextDouble();
			if (score > maxScore) {
				maxScore2 = maxScore;
				maxName2 = maxName;
				maxScore = score;
				maxName = name;
			}
			else if (score > maxScore2) {
				maxScore2 = score;
				maxName2 = name;
			}
		}
		System.out.println(maxName + " has the highest score " + maxScore);
		System.out.println(maxName2 + " has the second highest score " + maxScore2);
	}

}
