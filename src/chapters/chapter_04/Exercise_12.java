package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_12 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a hex digit  : ");
		char value = input.next().charAt(0);
		value = Character.toUpperCase(value);
		
		
		
		if(value >= 'A' && (value) <= 'F' ) {
			int number = (int)(value - 55);
			int temp = number;
			String str ="";
			
			str = (char)((temp % 2) + 48) + str;
			temp /= 2;
			str = (char)((temp % 2) + 48) + str;
			temp /= 2;
			str = (char)((temp % 2) + 48) + str;
			temp /= 2;
			str = (char)((temp % 2) + 48) + str;
			temp /= 2;
			System.out.println("The binary value is " + str);
			}
		else if(value >= '0' && value <= '9') {
			int number = (int)(value - '0');
			int temp = number;
			String str ="";
			str = (char)((temp % 2) + 48) + str;
			temp /= 2;
			str = (char)((temp % 2) + 48) + str;
			temp /= 2;
			str = (char)((temp % 2) + 48) + str;
			temp /= 2;
			str = (char)((temp % 2) + 48) + str;
			temp /= 2;
			System.out.println("The binary value is " + str);
			
	}
	}
}
