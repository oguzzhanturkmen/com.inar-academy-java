package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        double[] array = new double[10];
        getNumbers(array);
        double deviation = deviation(array);
        System.out.println("Deviation is : " + deviation);

    }

    public static void getNumbers(double[] numberArray) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = input.nextDouble();
        }
    }

    public static double mean(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Mean is : " + sum / array.length);
        return sum / array.length;
    }
    public static double deviation(double[] x){
        double sumDeviation = 0;
        for (int i = 0; i < x.length; i++) {
            sumDeviation += (Math.pow(x[i], 2));
        }
        double deviation = Math.sqrt((sumDeviation  - (Math.pow(mean(x) * x.length, 2) / x.length)) / (x.length - 1) );
        return deviation;
    }
}
