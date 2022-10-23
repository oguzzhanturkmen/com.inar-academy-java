package chapters.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array:");
        int[][] array = new int[input.nextInt()][input.nextInt()];
        fillTheArray(array);
        displayArray(array);
        System.out.println("Array " + (isConsecutiveFour(array) ? " is consecutive four " : " is not consecutive four "));



    }
    public static int generateRandomNumber(int[][] array) {
        int number = (int) (Math.random() * array.length);
        return number;
    }
    public static void fillTheArray(int[][] array) {

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = generateRandomNumber(array);
            }
        }
    }

    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
    public static boolean checkRow(int[][] array) {
        boolean check = false;
        for (int row = 0; row < array.length ; row++) {
            int counter = 0;
            for (int col = 0; col < array[row].length - 1; col++) {

                if (array[row][col] == array[row ][col + 1]) {
                    counter++;
                }
                else{
                    counter = 0;
                }


                if (counter == 4) {
                    System.out.println("Has consecutive four on row " + row);
                    return true;
                }
            }
        }
        return false;
        }

    public static boolean checkCol(int[][] array) {
        boolean check = false;
        for (int col = 0; col < array[0].length - 1; col++) {
            int counter = 0;
            for (int row = 0; row < array.length - 1; row++) {

                if (array[row][col] == array[row + 1][col ]) {
                    counter++;
                }
                else{
                    counter = 0;
                }


                if (counter == 4 ) {
                    System.out.println("Has consecitive four on col " + col);
                    return true;
                }
            }
        }
        return false;
        }


    public static boolean checkDiagonal(int[][] array) {
        int counter = 0;
        boolean check = false;


        for (int row = 0, col = 0; row < array.length - 1; row++, col++) {

            if (array[row][col] == array[row + 1][col + 1]) {
                counter++;

            }
            else{
                counter = 0;
            }


            if (counter == 4) {
                System.out.println("Has consecitive four on major diagonal ");
                return true;
            }
        }



        counter = 0;



        for (int row = 0, col = array.length - 1; row < array.length - 1; row++, col--) {

            if (array[row][col] == array[row + 1][col - 1]) {
                counter++;

            }
            else{
                counter = 0;
            }

            if (counter == array.length - 1) {
                System.out.println("Has consecitive four on major diagonal ");
                return true;
            }

        }
        return false;
    }
    public static boolean isConsecutiveFour(int[][] values){
        checkRow(values);
        checkDiagonal(values);

        return checkCol(values) || checkRow(values) || checkDiagonal(values);
    }
}
