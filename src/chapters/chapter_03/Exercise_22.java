package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_22 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the coordinate : ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		double distance = Math.pow((x * x) + (y * y), 0.5);
		
		if(distance > 10)
			System.out.println(x + "," + y +" is not in the circle");
		else
			System.out.println(x + "," + y +" is  in the circle");
		
	}

}
