package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_29 {
    public static void main(String[] args) {

        int primeHolder = 2;
        for (int i = 3; i < 1001; i++) {
            if (isPrime(i)) {
                if ((i - primeHolder) == 2) {
                    System.out.println(primeHolder + "," + i);
                }
                primeHolder = i;
            }
        }
    }
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
