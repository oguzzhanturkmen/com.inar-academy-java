package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        Arrays.fill(array,-1);
        int counter = 0;
        System.out.println("Enter 10 numbers :");
        for (int i = 0; i < array.length; i++){
            int x = input.nextInt();
            if(ifNotDuplicate(array , x)){
                array[counter] = x;
                counter++;
            }
        }
        System.out.println("The number of distinct number is " + counter);
        System.out.print("The distinct numbers are: " );
        for(int i = 0; i < counter; i++){
            System.out.print(array[i] + " ");
        }

    }
    public static boolean ifNotDuplicate(int[] array, int j){
        for(int i = 0; i < array.length; i++){
            if(array[i] == j){
                return
                        false;
            }
        }
        return true;
    }

    }

