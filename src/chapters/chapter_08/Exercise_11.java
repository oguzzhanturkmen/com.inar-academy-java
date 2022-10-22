package chapters.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511 : ");
        int number = input.nextInt();

        char[][] array = headsAndTails(number);
        displayArray(array);

    }
    public static char[][] headsAndTails(int number) {
        char[][] array = new char[3][3];
        String binary = Integer.toBinaryString(number);

        if (binary.length() != 9) {
            while (binary.length() != 9) {
                binary = '0' + binary;
            }
        }
        for (int i = 0; i < binary.length(); i++) {
            int counter = Integer.parseInt(binary.charAt(i) + "");
            if (counter == 0) {
                array[i / 3][i % 3] = 'H';
            }
            else {
                array[i / 3][i % 3] = 'T';
            }
        }
        return array;
    }
    public static void displayArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
