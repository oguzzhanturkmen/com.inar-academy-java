package chapters.chapter_07;

import java.util.Arrays;

public class Exercise_22 {
    public static void main(String[] args) {
        int[] array = new int[8];
        while(placeQueen(array));
        System.out.println(Arrays.toString(array));
        displayChessBoard(array);
    }
    public static boolean checkPosition(int queenPlace, int[] array, int loopCounter) {

        for (int i = 0 ,j = loopCounter; i < loopCounter; i++, j--) {
            if (queenPlace == array[i]) {
                return false;
            }
            if (queenPlace == array[i] + j || queenPlace == array[i] - j) {
                return false;
            }
        }
        return true;
    }
    public static boolean placeQueen(int[] array) {
        int queenPlace = (int) (Math.random() * 8);
        array[0] = queenPlace;
         boolean isTrue = true;
        int counter = 0;

        for (int i = 1; i < array.length; i++) {
            isTrue = true;
            while (isTrue) {
                queenPlace = (int) (Math.random() * 8);

                if (checkPosition(queenPlace, array, i)) {
                    array[i] = queenPlace;
                    isTrue = false;
                }
                else{
                    counter++;
                    if(counter > 100){
                       return true;
                    }
                }
            }

        }
        return false;
    }
    public static void displayChessBoard(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(j < array[i]){
                    System.out.print("| ");
                } else if (j == array[i]) {
                    System.out.print("|Q");
                } else if (j > array[i]) {
                    System.out.print("| ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
