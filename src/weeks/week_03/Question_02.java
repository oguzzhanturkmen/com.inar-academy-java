package weeks.week_03;

import java.util.Scanner;

public class Question_02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the ages : ");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		int oldest = 0;
		int youngest = 0;
		
		if (x > y && x > z ) {
			oldest = x;
			if(y > z)
				youngest = z;
			else
				youngest = y;
		}
		if (y > x && y > z ) {
			oldest = y;
			if(x > z)
				youngest = z;
			else
				youngest = x;
		
	}
		if (z > y && z > x ) {
			oldest = z;
			if(x > y)
				youngest = y;
			else
				youngest = x;
		}
			System.out.println("Youngest is " + youngest + " oldest is " + oldest);
	}
}
