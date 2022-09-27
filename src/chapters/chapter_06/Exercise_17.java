package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = input.nextInt();

        printMatrix(n);

    }

    public static void printMatrix(int n){
        for (int j = 1; j <= n; j++){

            for(int i = 1; i <= n; i++){
            System.out.printf("%-3d" , (int) (Math.random() * 2));
            }
        System.out.println();
        }
    }
}
