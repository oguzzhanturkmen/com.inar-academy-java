package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbersArray = new int[10];
        getNumbers(numbersArray, input);
        if(isConsecutiveFour(numbersArray)){
            System.out.println("The list has consecutive fours");
        }
        else {
            System.out.println("The list has no consecutive fours");
        }



    }
    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (i < values.length - 3) {
                if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3] ) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void getNumbers(int[] array, Scanner input) {
        System.out.println("Enter " + array.length + " numbers :");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }

}
