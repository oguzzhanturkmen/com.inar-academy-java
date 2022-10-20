package soruCozumu.week_02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {

        double[][] originalArray = createMatrix();

        double[][] sortedArray = sortArray(originalArray);

        System.out.println("Original array is : ");
        displayArray(originalArray);

        System.out.println("Sorted array is ");
        displayArray(sortedArray);

    }
    public static void copyTwoDimensionalArray(double[][] originalArray ,double[][] copyArray ){
        for(int i = 0; i < originalArray.length; i++){

            for(int j = 0; j < originalArray[i].length; j++){
                copyArray[i][j] = originalArray[i][j];
            }

        }
    }
    public static double[][] sortArray(double[][] originalArray){

        double[][] newArray = new double[originalArray.length][originalArray[0].length];
        copyTwoDimensionalArray(originalArray , newArray);

        for(int row = 0; row < newArray.length; row++){
            for(int col = 0; col < newArray[row].length; col++){

                double min = Double.MAX_VALUE;
                int index = -1;

                for(int i = col; i < newArray[row].length; i++){
                    if(min > newArray[row][i]){
                        min = newArray[row][i];
                        index = i;
                    }
                }
                if(index != col){
                    newArray[row][index] = newArray[row][col];
                    newArray[row][col] = min;
                }
            }
        }
        return newArray;
    }
    public static double[][] createMatrix(){
        Scanner input = new Scanner(System.in);

        double[][] array = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row:");

        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                array[row][col] = input.nextDouble();
            }
        }
        return array;
    }
    public static void displayArray(double[][] array){
        for(int i = 0; i < array.length;i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }

}
