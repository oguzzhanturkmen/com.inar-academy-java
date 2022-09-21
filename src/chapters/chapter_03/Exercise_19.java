package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_19 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three edges : ");
		int edge1 = input.nextInt();
		int edge2 = input.nextInt();
		int edge3 = input.nextInt();
		
		if(edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1)
			System.out.println("The perimeter is : " + (edge1 + edge2 + edge3));
		else
			System.out.println("This is not a valid triangle");
	}

}
