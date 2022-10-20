package soruCozumu.week_02;

import java.util.Scanner;

public class E_36 {
    public static void main(String[] args) {

        char[][] array = createArray();
        getInput(array);
        System.out.println("Array is " + ((checkIfLatinSquare(array)) ? "a latin square " : "not a latin square "));

    }
    public static char[][] createArray(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of n : ");
        int n = input.nextInt();

        char[][] array = new char[n][n];
        return array;
    }
    public static void getInput(char[][] array){
        Scanner input = new Scanner(System.in);

        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                array[row][col] = input.next().charAt(0);

                if(array[row][col] >= ('A' + array.length) || array[row][col] < 'A'){
                    System.out.println("Wrong input : the letters must be from A to " + (char)('A' + array.length - 1));
                    break;
                }
            }
        }
    }
    public static boolean checkIfLatinSquare(char[][] array){ // A B C B A
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){

                for(int i = col + 1; i < array[row].length; i++){
                    if(array[row][col] == array[row][i]){
                        return false;
                    }
                }
                for(int j = row + 1; j < array.length; j++){
                    if(array[row][col] == array[j][col]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
