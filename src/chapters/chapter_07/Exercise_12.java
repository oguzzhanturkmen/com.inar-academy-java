package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        int[] array = new int[10];
        getNumbers(array);
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }public static void reverseArray(int[] array){
        int hold ;

        for (int i = 0 , j = array.length - 1; i < array.length / 2 ; i++ , j--){
            hold = array[i];
            array[i] = array[j];
            array[j] = hold;

        }
    }
    public static void getNumbers(int[] numberArray) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = input.nextInt();
        }
    }
}
