package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int commonGreatest = -1;
		System.out.println("Enter two positive integer");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		if(Math.max(number1, number2) == number2) {
			int temp;
			temp = number2;
			number2 = number1;
			number1 = temp;
		}
		for(int i = number2; i > 0 ; i--) {
			if(number1 % i == 0 && number2 % i == 0) {
				commonGreatest = i;
				break;
				
			}
		}
		System.out.println("Common greatest divisor is : " + commonGreatest);
		
	}

}
