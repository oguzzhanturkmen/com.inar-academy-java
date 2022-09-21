package chapters.chapter_03.checkpoints_03;

import java.util.Scanner;

public class Checkpoint_27 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int weight = input.nextInt();
		int height = input.nextInt();
		
		System.out.println(weight > 50 && height > 60);
	}

}
