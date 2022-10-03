package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = input.nextLine();
        System.out.println("Enter the char");
        char ch = input.nextLine().charAt(0);
        System.out.println("Number of occurence :" + count(str , ch));

    }

    public static int count(String str, char a){
        int counter = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == a){
                counter++;
            }
        }
        return counter;
    }
}
