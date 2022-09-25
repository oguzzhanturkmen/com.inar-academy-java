package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1 , num2 , num3);
    }


    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp = 0;

        if (num2 > num1 && num2 > num3) {
            temp = num2;
            num2 = num1;
            num1 = temp;
        } else if (num3 > num1 && num3 > num2) {
            temp = num3;
            num3 = num1;
            num1 = temp;
        }
        if (num3 > num2) {
            temp = num3;
            num3 = num2;
            num2 = temp;

        }
        System.out.println(num3 + " " + num2 + " " + num1);


    }
}