package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of array :");
        int numberofArray = input.nextInt();
        int[] array1 = new int[numberofArray];
        getNumbers(array1, input);
        System.out.println("Enter the number of array 2 :");
        numberofArray = input.nextInt();
        int[] array2 = new int[numberofArray];
        getNumbers(array2 , input);
        int[] megedArary = new int[array1.length + array2.length];
        fillMergedArray(array1 , array2 , megedArary);
        bubbleSort(megedArary);
        System.out.println(Arrays.toString(megedArary));

    }

    public static void getNumbers(int[] array, Scanner input) {
        System.out.println("Enter " + array.length + " numbers :");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }
        public static void bubbleSort(int[] array){

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
        public static void fillMergedArray(int[] array1 , int[] array2 , int[] mergedArray){
            for(int i = 0; i < array1.length; i++){
                mergedArray[i] = array1[i];
            }
            for(int i = 0 , j = array1.length; i < array2.length; i++ , j++){
                mergedArray[j] = array2[i];
            }
    }
}