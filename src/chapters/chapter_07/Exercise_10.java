package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        double array[] = new double[10];
        getNumbers(array);
        int smallest = indexOfSmallestElement(array);
        System.out.println("Index of smallest is : " + smallest);

    }



    public static int indexOfSmallestElement(double[] array){
        int index = 0;
        double smallest = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void getNumbers(double[] numberArray) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = input.nextDouble();
        }
}
}