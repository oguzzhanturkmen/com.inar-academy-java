package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        char[][] array = new char[3][3];
        fillTheArray(array);
        displayTable(array);
        int counter = 0;
        while(counter < 9){
            getInputFromPlayer(array, 0);
            displayTable(array);
            if(checkIfEnds(array)){
                break;
            }
            counter++;
            if(counter == 9){
                System.out.println("Its draw ! ");
                break;
            }

            getInputFromPlayer(array, 1);
            displayTable(array);
            if(checkIfEnds(array)){
                break;
            }
            counter++;

        }

    }
    public static void displayTable(char[][] array) {
        System.out.println("-------------------");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                System.out.print("|  ");
                System.out.print(array[row][col]);
                System.out.print("  ");
            }
            System.out.println("|");
            System.out.println("-------------------");


        }
    }
    public static void fillTheArray(char[][] array) {

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = ' ';
            }
        }
    }
    public static void getInputFromPlayer(char[][] array, int player) {
        Scanner input = new Scanner(System.in);
        int row;
        int col;
        System.out.print("Enter a row (0, 1, or 2) for player " + ((player == 0) ? " X " : " O "));
        row = input.nextInt();
        System.out.print("Enter a row (0, 1, or 2) for player " + ((player == 0) ? " X " : " O "));
        col = input.nextInt();

        if (player == 0) {
            array[row][col] = 'X';
        } else {
            array[row][col] = 'O';
        }

    }
    public static boolean checkRow(char[][] array) {

        for (int row = 0; row < array.length; row++) {
            int xCounter = 0;
            int oCounter = 0;
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == 'X') {
                    xCounter++;
                }
                if (array[row][col] == 'O') {
                    oCounter++;
                }
        }
            if (xCounter == 3 || oCounter == 3) {
                checkForWinner(xCounter, oCounter);
                return true;
            }
        }
        return false;
    }
    public static boolean checkCol(char[][] array) {

        for (int col = 0; col < array[0].length; col++) {
            int xCounter = 0;
            int oCounter = 0;
            for (int row = 0; row < array.length; row++) {
                if (array[row][col] == 'X') {
                    xCounter++;
                }
                if (array[row][col] == 'X') {
                    oCounter++;
                }
            }
            if (xCounter == 3 || oCounter == 3) {
                checkForWinner(xCounter, oCounter);
                return true;
            }

        }
        return false;
    }
    public static boolean checkDiagonal(char[][] array) {
        int xCounter = 0;
        int oCounter = 0;

        for (int row = 0 , col = 0; row < array.length; row++ , col++) {
            if (array[row][col] == 'X') {
                xCounter++;
            }
            if (array[row][col] == 'X') {
                oCounter++;
            }
        }
        if (xCounter == 3 || oCounter == 3) {
            checkForWinner(xCounter, oCounter);
            return true;
        }
        xCounter = 0;
        oCounter = 0;

        for (int row = array.length - 1,  col = array.length - 1; row >= 0; row-- , col--) {
            if (array[row][col] == 'X') {
                xCounter++;
            }
            if (array[row][col] == 'X') {
                oCounter++;
            }
        }
        if (xCounter == 3 || oCounter == 3) {
            checkForWinner(xCounter, oCounter);
            return true;
        }
        return false;

        }

    public static void checkForWinner(int xCounter, int oCounter) {
        if (xCounter == 3) {
            System.out.println("Player X wins !");
        }
        else if (oCounter == 3) {
            System.out.println("Player O wins ! ");
        }
    }
    public static boolean checkIfEnds(char[][] array){
        return (checkCol(array) || checkDiagonal(array) || checkRow(array));
    }
}
