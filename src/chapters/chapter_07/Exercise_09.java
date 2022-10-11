package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 double numbers : ");

        double[] numbers = new double[10];
        getNumbers(numbers);
        double average = average(numbers);
        System.out.println("Average is " + average);

    }

    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static void getNumbers(double[] numberArray) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = input.nextDouble();
        }
    }

}