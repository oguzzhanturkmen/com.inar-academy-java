package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_16 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int number = input.nextInt();
		int n = 2;
		while(number != 1) {
			if(number % n == 0) {
				System.out.print(n + " ");
				number /= n;
			}
			else {
				n++;
			}
		}
	}

}
