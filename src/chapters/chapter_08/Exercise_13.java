package chapters.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        double[][] array = getInput();
        int[] location =locateLargest(array);
        System.out.println("The location of the largest element is at  " + Arrays.toString(location));
    }
    public static int[] locateLargest(double[][] a){
        int[] array = {0 , 0 };
        double max = 0;

        for (int row = 0; row < a.length; row++){
            for(int col = 0; col < a[0].length; col++){
                if(a[row][col] > max){
                    max = a[row][col];
                    array[0] = row;
                    array[1] = col;

                }
            }
        }
        return array;
    }
    public static double[][] getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array:");
        double[][] array = new double[input.nextInt()][input.nextInt()];
        System.out.println("Enter the input : ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextDouble();
            }
        }
        return array;
    }
}
