package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {

        double[][] array = new double[3][4];

        getInput(array);
        printSumOfColumn(array);
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }

    public static void getInput(double[][] array) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input : ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextDouble();
            }
        }
    }

    public static void printSumOfColumn(double[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(array, i));

        }

    }

    public static void getInput(int[][] array) { //Added for overloading , i will use it in other exercises , to make it easier
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input : ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextInt();
            }
        }
    }
}