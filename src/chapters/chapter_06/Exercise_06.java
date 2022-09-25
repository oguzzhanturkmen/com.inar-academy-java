package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number for triangle :");
        int number = input.nextInt();

        displayPattern(number);

    }
    public static void displayPattern(int n){

        for(int i = 1; i < n + 1; i++){
            for(int j = n - i; j >= 0; j--){
                System.out.printf("%3s" , "");
            }
            for(int k = i; k > 0; k--){
                System.out.printf("%3d" ,k);
            }
            System.out.println();
        }
    }

}
