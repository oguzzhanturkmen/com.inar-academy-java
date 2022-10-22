package chapters.chapter_08;

import java.util.Arrays;

public class Exercise_10 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        fillTheArray(array);
        displayArray(array);
        System.out.println("The largest row index : " + checkRow(array) + "\n The largest col index : " + checkCol(array));

    }
    public static int generateRandomNumber(){
        int number = (int)(Math.random() * 2);
        return number;
    }
    public static void fillTheArray(int[][] array){

        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                array[row][col] = generateRandomNumber();
            }
        }
    }
    public static int checkRow(int[][] array){
        int rowIndex = 0;
        int counterOut = 0;
        for(int row = 0; row < array.length; row++){

            int counterIn = 0;

            for(int col = 0; col < array[row].length; col++){
                if(array[row][col] == 1){
                    counterIn++;
                }
            }
            if(counterIn > counterOut){
                counterOut = counterIn;
                rowIndex = row;
            }
        }
        return rowIndex;
    }
    public static int checkCol(int[][] array){
        int colIndex = 0;
        int counterOut = 0;
        for(int col = 0; col < array[0].length; col++){
            int counterIn = 0;

            for(int row = 0; row < array.length; row++){
                if(array[row][col] == 1){
                    counterIn++;
                }
            }
            if(counterIn > counterOut){
                counterOut = counterIn;
                colIndex = col;
            }
        }
        return colIndex;
    }
    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
