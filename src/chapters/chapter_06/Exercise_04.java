package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer :");
        int number = input.nextInt();

        System.out.println(reverse(number));

    }

    public static int reverse(int number){

        String str = Integer.toString(number);
        String str2 = "";
        for(int i = str.length() - 1; i >= 0; i--){
            str2 += str.charAt(i);
        }
        number = Integer.parseInt(str2);
        return number;
    }
}
