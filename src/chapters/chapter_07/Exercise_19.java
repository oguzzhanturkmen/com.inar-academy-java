package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter the list: ");
            int[] array = new int[input.nextInt()];

            getInputForArray(array , input);

            System.out.println("The list is " + (isSorted(array) ? "already " : "not ") + "sorted");
        }

        public static boolean isSorted(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                return (!(array[i] > array[i + 1]));
            }
            return false;
        }
    public static void getInputForArray(int[] array , Scanner input){
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
    }
    }

