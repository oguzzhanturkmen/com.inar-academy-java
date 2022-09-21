package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int computerCount = 0;
		int playerCount = 0;
		int computer = 0;
		while (computerCount < 3 && playerCount < 3) {
			computer = (int) (Math.random() * 3);

			System.out.println("scissor (0), rock (1), paper(2) : ");
			int player = input.nextInt();

			if (computer == 0 && player == 1) {
				System.out.println("The computer is scscissor. You are rock. You won");
				playerCount++;
			} else if (computer == 1 && player == 2) {
				System.out.println("The computer is rock. You are paper. You won");
				playerCount++;
			} else if (computer == 2 && player == 0) {
				System.out.println("The computer is paper. You are scscissor. You won");
				playerCount++;
			} else if (computer == 0 && player == 2) {
				System.out.println("The computer is scissors. You are paper. You lose");
				computerCount++;
			} else if (computer == 1 && player == 0) {
				System.out.println("The computer is rock. You are scscissor. You lose");
				computerCount++;
			} else if (computer == 2 && player == 1) {
				System.out.println("The computer is paper. You are rock. You lose");
				computerCount++;
			} else if (computer == player) {
				System.out.print("The compuer is ");
				if (computer == 0)
					System.out.println("scissor. You are scissor too. It is a draw.");
				else if (computer == 1)
					System.out.println("rock. You are rock too. It is a draw.");
				else if (computer == 2)
					System.out.println("paper. You are paper too. It is a draw.");
			}
		}
		System.out.println("Computer is " + computerCount + "\n" + "Player is " + playerCount);
	}

}
