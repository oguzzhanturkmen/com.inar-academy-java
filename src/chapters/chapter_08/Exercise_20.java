package chapters.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_20 {
    public static void main(String[] args) {
        char[][] board = createGameBoard();
        playGame(board);


    }

    public static char[][] createGameBoard() {
        char[][] board = new char[6][7];
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], ' ');
        }
        return board;
    }

    public static void drawBoard(char[][] board) {
        System.out.println("------------------------------\n");
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print("| ");
                System.out.print(board[row][col]);
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void getInputFromPlayer(char[][] array, int player) {
        Scanner input = new Scanner(System.in);
        int col;
        System.out.print("Drop a red disk at column (0–6): " + ((player == 0) ? " R: " : " Y: "));
        col = input.nextInt();

        if (isDraw(array)) {
            int placeHolder = checkAndPlaceCol(array, col);
            if (placeHolder != -1) {
                array[placeHolder][col] = (player == 0) ? 'R' : 'Y';
            }
            else{
                System.out.println("The column is full, try another :");
            }
        }
    }
        public static int checkAndPlaceCol ( char[][] board, int col){
            for (int i = board.length - 1; i >= 0; i--) {
                if (board[i][col] == ' ') {
                    return i;
                }
            }
            return -1;
        }
        public static boolean checkRow ( char[][] array){
            boolean check = false;
            for (int row = 0; row < array.length; row++) {
                int counter = 0;
                for (int col = 0; col < array[row].length - 1; col++) {
                    if (array[row][col] != ' ') {

                        if (array[row][col] == array[row][col + 1]) {
                            counter++;
                        } else {
                            counter = 0;
                        }
                    }
                    if (counter == 3) {
                        return true;
                    }
                }
            }
            return false;
        }
        public static boolean checkCol ( char[][] array){
            boolean check = false;
            for (int col = 0; col < array[0].length - 1; col++) {
                int counter = 0;
                for (int row = 0; row < array.length - 1; row++) {
                    if (array[row][col] != ' ') {

                        if (array[row][col] == array[row + 1][col]) {
                            counter++;
                        } else {
                            counter = 0;
                        }
                    }
                    if (counter == 3) {
                        return true;
                    }
                }
            }
            return false;
        }
        public static boolean checkDiagonal ( char[][] array){
            int counter = 0;
            boolean check = false;

            for (int row = 0, col = 0; row < array.length - 1; row++, col++) {
                if (array[row][col] != ' ') {
                    if (array[row][col] == array[row + 1][col + 1]) {
                        counter++;

                    } else {
                        counter = 0;
                    }
                }
                if (counter == 3) {
                    return true;
                }
            }
            counter = 0;

            for (int row = 0, col = array.length - 1; row < array.length - 1; row++, col--) {
                if (array[row][col] != ' ') {
                    if (array[row][col] == array[row + 1][col - 1]) {
                        counter++;

                    } else {
                        counter = 0;
                    }
                }

                if (counter == 3) {
                    return true;
                }

            }
            return false;
        }
        public static boolean isWin ( char[][] array){
            return (checkRow(array) || checkCol(array) || checkDiagonal(array));
        }
        public static boolean isDraw ( char[][] array){
            boolean check = false;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == ' ') {
                        check = true;
                    }
                }
            }
            return check;
        }
        public static void playGame(char[][] array) {
            drawBoard(array);
            while (true) {
                getInputFromPlayer(array, 0);
                drawBoard(array);
                if (isWin(array)) {
                    System.out.println("Player Red Wins !! ");
                    break;
                }
                if (!isDraw(array)) {
                    System.out.println("Its draw !!");
                    break;
                }
                getInputFromPlayer(array, 1);
                drawBoard(array);
                if (isWin(array)) {
                    System.out.println("Player Yellow Wins !! ");
                    break;
                }
                if (!isDraw(array)) {
                    System.out.println("Its draw !!");
                    break;
                }
            }
        }
}






