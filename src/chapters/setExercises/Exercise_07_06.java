package chapters.setExercises;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Exercise__07_06 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int number = 2;

        while(set.size() < 50){
            if(isPrime(number , set)){
                set.add(number);
            }
            number++;
        }
        System.out.println(set);


    }
    public static boolean isPrime(int number, Set<Integer> set) {
        for (int divisor : set) {
            if (divisor <= Math.sqrt(number) && number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
