package chapters.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {

        int[][] array = createArray();
        displayArray(array);
        flipCell(array);
        int[] flippedCell = findFlipped(array);
        System.out.println("The flipped cell is at " + Arrays.toString(flippedCell) );

    }
    public static int[][] createArray() {
        int[][] array = {{0, 0, 1, 1, 0 ,0},
                         {1, 1, 1, 1, 0, 0},
                         {1, 0, 1, 1, 1, 0},
                         {1, 1, 1, 1, 0, 0},
                         {0, 1, 0, 0, 0, 1},
                         {1, 1, 0, 0, 1, 1}};
        return array;
    }
    public static void flipCell(int[][] array){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row and col that you want to flip : ");
        int row = input.nextInt();
        int col = input.nextInt();
        array[row][col] = (array[row][col] == 0) ? 1 : 0;
        System.out.println("Array after flipping \n ------------------");
        displayArray(array);
    }
    public static int[] findFlipped(int[][] array){

        int[] indexOfCell = new int[2];

        for(int row = 0; row < array.length; row++){
            int counter = 0;
            for(int col = 0; col < array[row].length; col++){
                if(array[row][col] == 1){
                    counter++;
                }
            }
            if(counter % 2 != 0){
                indexOfCell[0] = row;
            }
        }

        for(int col = 0; col < array[0].length; col++){
            int counter = 0;
            for(int row = 0; row < array.length; row++){
                if(array[row][col] == 1){
                    counter++;
                }
            }
            if(counter % 2 != 0){
                indexOfCell[1] = col;
            }
        }
        return indexOfCell;
    }
    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

}
