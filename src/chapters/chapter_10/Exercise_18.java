package chapters.chapter_10;

import java.math.BigInteger;

public class Exercise_18 {
    public static void main(String[] args) {

        // CANT GET THE OUTPUT !!
        BigInteger number = new BigInteger(Long.MAX_VALUE  + "");
        int counter = 0;

        while (counter < 5) {
            if (isPrime(number)) {
                System.out.println(number);
                counter++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
    public static boolean isPrime(BigInteger number) {
        BigInteger loop = new BigInteger(Long.MAX_VALUE / 2 + "");
        BigInteger divisor = new BigInteger("2");
        BigInteger zero = new BigInteger(BigInteger.ZERO + "");

        while (divisor.compareTo(loop) != 0) {

            if (number.remainder(divisor).compareTo(zero) == 0) {
                return false;
            }
            divisor.add(BigInteger.ONE);
        }
        return true;
    }
}

