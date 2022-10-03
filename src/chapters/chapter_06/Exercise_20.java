package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yout string : ");
        String str = input.nextLine();
        System.out.println("Number of letters in this string : " + countLetters(str));

    }
    public static int countLetters(String s){
        int counter = 0;
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')  ){
                counter++;
            }
        }
        return counter;
    }
}
