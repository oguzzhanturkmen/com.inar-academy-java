package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_24 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int random =(int)(Math.random() * 13 + 1);
		
		System.out.print("The card you picked is ");
		if(random == 1) 
			System.out.print("Ace ");
		else if(random == 11)
			System.out.print("Jack ");
		else if(random == 12)
			System.out.print("Queen ");
		else if(random == 13)
			System.out.print("King ");
		else
			System.out.print(random + " ");
		
		System.out.print("of ");
		
		
		random =(int)(Math.random() * 4 + 1);
		
		if(random == 1)
			System.out.println("Clubs");
		else if(random == 2)
			System.out.println("Diamonds");
		else if(random == 3)
			System.out.println("Hearts");
		else if(random == 4)
			System.out.println("Spades");
		
	}

}
