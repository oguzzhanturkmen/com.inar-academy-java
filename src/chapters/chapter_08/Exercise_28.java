package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_28 {
    public static void main(String[] args) {
        int[][] m1 = createMatrix();
        int[][] m2 = createMatrix();

        System.out.println("Two arrays are " +  (equals(m1 , m2) ? "strictly identical" : "not strictly identical"));

    }
    public static boolean equals(int[][] m1, int[][] m2){

        for(int row = 0; row < m1.length; row++){
            for(int col = 0; col < m1[row].length; col++){
                if(m1[row][col] != m2[row][col]){
                    return false;
                }
            }
        }
        return true;
    }
    public static int[][] createMatrix(){
        Scanner input = new Scanner(System.in);

        int[][] array = new int[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row:");

        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                array[row][col] = input.nextInt();
            }
        }
        return array;
    }
}
