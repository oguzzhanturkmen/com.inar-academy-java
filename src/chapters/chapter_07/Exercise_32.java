package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_32 {
    public static void main(String[] args) {
        int[] array = getInput();
        partition(array);

    }

    public static void partition(int[] array) {
        int[] newArray = new int[array.length];

        int pivot = array[0];
        int high = array.length - 1;
        int low = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < pivot) {
                newArray[low] = array[i];
                low++;
            } else {
                newArray[high] = array[i];
                high--;
            }
        }
        newArray[low] = pivot;
        array = newArray;


    displayArray(array);

}
    public static void displayArray(int[] array) {
        System.out.print("After the partition , the list is : ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int[] getInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list:");
        int numberOfValues = input.nextInt();
        int[] array = new int[numberOfValues];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }
}
