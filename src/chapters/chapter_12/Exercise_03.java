package chapters.chapter_12;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        try {
            System.out.println("Enter the index ");
            int index = input.nextInt();
            System.out.println("Value is " + array[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of bounds");
        }
    }
}
