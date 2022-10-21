package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbersArray = new int[10];
        getNumbers(numbersArray , input);
        printCombinations(numbersArray);
    }

    public static void printCombinations(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
    public static void getNumbers(int[] array, Scanner input) {
        System.out.println("Enter " + array.length + " numbers :");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }
}