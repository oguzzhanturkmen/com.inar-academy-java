package chapters.chapter_10;

import java.math.BigInteger;

public class Exercise_16 {
    public static void main(String[] args) {

        //PROBLEM WITH OUTPUT , DRIVING ME CRAZY !!!!!!!!

        int counter = 0;
        BigInteger number = new BigInteger("1000000000000000000000000000000000000000000000000");
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");

        while (counter < 10) {

            if (number.remainder(two).compareTo(BigInteger.ZERO) == 0 || number.remainder(three).compareTo(BigInteger.ZERO) == 0) {
                System.out.println(number);
                counter++;
            }
            number.add(BigInteger.ONE);
        }
    }
}




