package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter two chars and number per line: " );
        char ch1 = input.nextLine().charAt(0);
        char ch2 = input.nextLine().charAt(0);
        int numberPerLine = input.nextInt();

        printChars(ch1 , ch2 , numberPerLine);


    }
    public static void printChars(char ch1, char ch2 , int numberPerline){
        int count = 0;
        for(int i = ch1; i <=ch2; i++){
            System.out.print((char) i+ " ") ;
            count++;
            if(count % numberPerline == 0){
                System.out.println();
            }

        }
    }
}
