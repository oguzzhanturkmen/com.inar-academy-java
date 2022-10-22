package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {

        double[][] a = createMatrix();
        double[][] b = createMatrix();

        double[][] sum = addMatrix(a, b);
        System.out.println("The matrices are added as follows ");

        for (int i = 0; i < sum.length; i++) {
            print(a, i);
            System.out.print((i == 1 ? "   +   " : "       "));
            print(b, i);
            System.out.print((i == 1 ? "   =   " : "       "));
            print(sum, i);
            System.out.println();
        }
    }


    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] array = new double[a.length][a[0].length];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = a[row][col] + b[row][col];
            }
        }
        return array;
    }

    public static double[][] createMatrix() {
        Scanner input = new Scanner(System.in);

        double[][] array = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row:");

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextDouble();
            }
        }
        return array;
    }

    public static void print(double[][] array, int r) {
        for (int i = 0; i < array[r].length; i++) {
            System.out.printf("%.1f "  ,(array[r][i]));
        }
    }
}
