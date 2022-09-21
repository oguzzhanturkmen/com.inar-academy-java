package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int computer = (int)(Math.random() * 3);
		
		System.out.println("scissor (0), rock (1), paper(2) : ");
		int player = input.nextInt();
		
		
		if(computer == 0 && player == 1) {
			System.out.println("The computer is scscissor. You are rock. You won");
		}
		else if(computer == 1 && player == 2) {
			System.out.println("The computer is rock. You are paper. You won");
		}
		else if(computer == 2 && player == 0) {
			System.out.println("The computer is paper. You are scscissor. You won");
		}
		else if(computer == 0 && player == 2) {
			System.out.println("The computer is scissors. You are paper. You lose");
		}
		else if(computer == 1 && player == 0) {
			System.out.println("The computer is rock. You are scscissor. You lose");
		}
		else if(computer == 2 && player == 1) {
			System.out.println("The computer is paper. You are rock. You lose");
		}
		else if(computer == player) {
			System.out.print("The compuer is ");
			if(computer == 0)
				System.out.println("scissor. You are scissor too. It is a draw.");
			else if(computer == 1)
				System.out.println("rock. You are rock too. It is a draw.");
			else if(computer == 2)
				System.out.println("paper. You are paper too. It is a draw.");
		}
	}

}
