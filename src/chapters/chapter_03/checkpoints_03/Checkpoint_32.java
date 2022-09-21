package chapters.chapter_03.checkpoints_03;

import java.util.Scanner;

public class Checkpoint_32 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the day number : ");
		int day = input.nextInt();
		
		switch(day) {
		case 0: System.out.println("sunday");
		break;
		case 1: System.out.println("monday");
		break;
		case 2: System.out.println("tuesday");
		break;
		case 3: System.out.println("wednesday");
		break;
		case 4: System.out.println("thursday");
		break;
		case 5: System.out.println("friday");
		break;
		case 6: System.out.println("saturday");
		break;
		default: System.out.println("wrong entry");
		break;
		}
	}

}
