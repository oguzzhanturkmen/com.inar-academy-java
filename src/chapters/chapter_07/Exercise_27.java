package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of array :");
        int numberofArray = input.nextInt();
        int[] array1 = new int[numberofArray];
        getNumbers(array1, input);
        System.out.println("Enter the number of array 2 :");
        numberofArray = input.nextInt();
        int[] array2 = new int[numberofArray];
        getNumbers(array2, input);

        if (equals(array1, array2)) {
            System.out.println("Two lists are  identical");
        } else {
            System.out.println("Not identical ");
        }
    }

    public static void getNumbers(int[] array, Scanner input) {
        System.out.println("Enter " + array.length + " numbers :");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        bubbleSort(array1);
        bubbleSort(array2);
            for (int j = 0; j < array1.length; j++) {
                if (!(array1[j] == array2[j])) {
                    return false;
                }
            }
        return true;
        }




    public static void bubbleSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
