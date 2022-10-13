package soruCozumu;

import java.util.Arrays;
import java.util.Scanner;

public class Cozum_15 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        getNumbers(numbers);
        int[] eliminatedArray = eliminateDuplicates(numbers);
        System.out.println("First array : " + Arrays.toString(numbers));
        System.out.println("Eliminated array : " + Arrays.toString(eliminatedArray));

    }
    public static void getNumbers(int [] numbers ){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 numbers : ");

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
    }
    public static int[] eliminateDuplicates(int[] numberArray){
        int[] array = new int[numberArray.length];
        int indexForEliminatedArray = 0;

        for(int i = 0; i < numberArray.length; i++){ //5 - 4  - 5

            if(ifNotDuplicate(array , numberArray[i])){
                array[indexForEliminatedArray] = numberArray[i];
                indexForEliminatedArray++;
            }
        }
        int[] eliminatedArray = new int[indexForEliminatedArray];
        System.arraycopy(array , 0 ,eliminatedArray ,0 , indexForEliminatedArray);
        return eliminatedArray;

    }
    public static boolean ifNotDuplicate(int[] eliminatedArray , int j) {
        for(int i = 0; i < eliminatedArray.length; i++){

            if(eliminatedArray[i] == j){
                return false;
            }
        }
        return true;
    }
}
