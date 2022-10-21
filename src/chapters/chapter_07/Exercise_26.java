package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of array :");
        int numberofArray = input.nextInt();
        int[] array1 = new int[numberofArray];
        getNumbers(array1,input);
        System.out.println("Enter the number of array 2 :");
        numberofArray = input.nextInt();
        int[] array2 = new int[numberofArray];
        getNumbers(array2,input);

        if (equals(array1, array2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Not strictly identical");
        }


    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!(array1[i] == array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void getNumbers(int[] array, Scanner input) {
        System.out.println("Enter " + array.length + " numbers :");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }
}
