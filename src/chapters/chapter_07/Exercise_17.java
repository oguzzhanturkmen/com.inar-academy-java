package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students : ");
        int numberOfStudents = input.nextInt();
        input.nextLine();

        String[] studentArray = new String[numberOfStudents];
        int[] scoreArray = new int[numberOfStudents];
        getInputForArray(studentArray , input);
        getInputForArray(scoreArray , input);
        System.out.println(Arrays.toString(studentArray) + "\n " + Arrays.toString(scoreArray));
        selectionSortforBoth(scoreArray , studentArray);
        System.out.println(Arrays.toString(studentArray) + "\n " + Arrays.toString(scoreArray));



    }
    public static void getInputForArray(int[] array , Scanner input){
        System.out.println("Enter scores :");
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
    }
    public static void getInputForArray(String[] array , Scanner input) {
        System.out.println("Enter names : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextLine();


        }
    }
        public static void selectionSortforBoth(int[] array , String[] students){
            for(int i = 0; i < array.length - 1; i++){

                int minimum = array[i];
                int minimumIndex = i;
                String temp = "";

                for(int j = i + 1; j < array.length; j++){
                    if(minimum > array[j]){
                        minimum = array[j];
                        minimumIndex = j;
                        temp += students[j];

                    }
                }
                if(minimumIndex != i){
                    array[minimumIndex] = array[i];
                    array[i] = minimum;
                    students[minimumIndex] = students[i];
                    students[i] = temp;
                }
            }
        }
}
