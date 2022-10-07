package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        int[] numberArray = getNumbers(input);
        reverseNumbers(numberArray);

    }
    public static int[] getNumbers(Scanner input){
        System.out.println("Enter 10 integers ");
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
    public static void reverseNumbers(int[] numberArray){
        for(int i = numberArray.length - 1 ; i >= 0; i--){
            System.out.printf("%-3d" ,numberArray[i] );
        }
    }
}
