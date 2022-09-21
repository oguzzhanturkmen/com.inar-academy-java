package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_24 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first city: ");
		String city1 = input.next();
		
		System.out.println("Enter the second city: ");
		String city2 = input.next();
		
		System.out.println("Enter the third city: ");
		String city3 = input.next();
		
		String tmp = "";
		if(city2.compareToIgnoreCase(city1) < 0 && city2.compareToIgnoreCase(city3) < 0) {
			tmp = city1;
			city1 = city2;
			city2 = tmp;
		}
		else if(city3.compareToIgnoreCase(city1) < 0 && city3.compareToIgnoreCase(city2) < 0) {
			tmp = city1;
			city1 = city3;
			city3 = tmp;
		}
		if(city3.compareToIgnoreCase(city2) < 0) {
			tmp = city3;
			city3 = city2;
			city2 = tmp;
		}
		
		System.out.printf("The three cities in alphabetical order are %s %2s %2s"  ,city1, city2 , city3);
	}
}
