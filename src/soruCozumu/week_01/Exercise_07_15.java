package soruCozumu.week_01;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_07_15 {
    public static void main(String[] args) {

        int[] numberArray = new int[10];
        getNumbers(numberArray);
        int [] eliminatedArray = eliminateDuplicates(numberArray );
        System.out.println("First array : " + Arrays.toString(numberArray));
        System.out.println("Eliminated array : "  + Arrays.toString(eliminatedArray));
    }
    public static void getNumbers(int[] numberArray){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");

        for(int i = 0; i < numberArray.length; i++){
            numberArray[i] = input.nextInt();
        }
    }
    public static int[] eliminateDuplicates(int[] numberArray ){

        int[] array = new int[numberArray.length];
        int indexForEliminatedArray = 0;

        for(int i = 0; i < numberArray.length; i++){
            if(ifNotDuplicate(array, numberArray[i])){
                array[indexForEliminatedArray] = numberArray[i];
                indexForEliminatedArray++;
            }
        }
        int[] eliminatedArray = new int[indexForEliminatedArray];
        System.arraycopy(array , 0 , eliminatedArray,0 , indexForEliminatedArray);
        return eliminatedArray;
    }
    public static boolean ifNotDuplicate(int[] eliminatedArray, int j){
        for(int i = 0; i < eliminatedArray.length; i++){
            if(eliminatedArray[i] == j){
                return false;
            }
        }
        return true;
    }
}
