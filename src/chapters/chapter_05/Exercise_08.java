package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_08 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int numberofStudents;
	double maxScore = 0;	
	String maxName ="";
	System.out.println("Enter the number of students : ");
	numberofStudents = input.nextInt();
	
	for(int i = 0; i < numberofStudents; i++) {
		System.out.println("Enter the name and the score :");
		String name = input.next();
		double score = input.nextDouble();
		if(score > maxScore) {
			maxScore = score;
			maxName = name;
		}
		} 
		System.out.println(maxName + " has the highest score " + maxScore);
	}
	
	
}

