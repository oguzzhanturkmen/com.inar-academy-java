package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_18 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two characters: ");
		String str = input.next();
		str = str.toUpperCase();
		String str2 = "";
		String str3 = "";
		boolean checkStatus = true;
		
		if(str.charAt(0) == 'M' )
			str2 = "Mathematics ";
		else if (str.charAt(0) == 'C' )
			str2 = "Computer Science ";
		else if (str.charAt(0) == 'I' )
			str2 = "Information Technology ";
		else
			checkStatus = false;
		
		if(str.charAt(1) == '1')
			str3 = "Freshman ";
		else if(str.charAt(1) == '2')
			str3 = "Sophmore ";
		else if(str.charAt(1) == '3')
			str3 = "Junior";
		else if(str.charAt(1) == '4')
			str3 = "Senior ";
		else
			checkStatus = false;
		
		if(checkStatus)
			System.out.println(str2 + " " + str3);
		else
			System.out.println("Invalid input !");
		
	}

}
