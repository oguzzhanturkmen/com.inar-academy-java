package chapters.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array size :");
        int a = input.nextInt();

        int[][] array = new int[a][a];

        fillTheArray(array);
        displayArray(array);
        checkRow(array);
        checkCol(array);
        checkDiagonal(array);


    }

    public static int generateRandomNumber() {
        int number = (int) (Math.random() * 2);
        return number;
    }

    public static void fillTheArray(int[][] array) {

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = generateRandomNumber();
            }
        }
    }

    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static void checkRow(int[][] array) {
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


                if (counter == array[0].length - 1) {
                    System.out.println("All " + array[row][col] + "'s on row " + row);
                    check = true;
                }
            }
        }
        if (!check) {
            System.out.println("No same numbers on a row !");
        }
    }

    public static void checkCol(int[][] array) {
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


                if (counter == array.length - 1 ) {
                    System.out.println("All " + array[row][col] + "'s on col " + col);
                    check = true;
                }
            }
        }
        if (!check) {
            System.out.println("No same numbers on a column !");
        }
    }

    public static void checkDiagonal(int[][] array) {
        int counter = 0;
        boolean check = false;


        for (int row = 0, col = 0; row < array.length - 1; row++, col++) {

                if (array[row][col] == array[row + 1][col + 1]) {
                    counter++;

                }
                else{
                    counter = 0;
                }


                if (counter == array.length - 1) {
                    System.out.println("All " + array[row][col] + "'s on the major diagonal ");
                    check = true;
                }
            }


        if (!check) {
            System.out.println("No same numbers on a major diagonal !");
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
                    System.out.println("All " + array[row][col] + "'s on the major diagonal ");
                    check = true;
                }

            }
        if (!check) {
            System.out.println("No same numbers on a major diagonal !");
        }
        }
    }

