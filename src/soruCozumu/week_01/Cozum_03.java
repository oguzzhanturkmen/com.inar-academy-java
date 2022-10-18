package soruCozumu.week_01;

import java.util.Scanner;

public class Cozum_03 {
    public static void main(String[] args) {

        int[] occurrence = new int[100];
        countOccurrences(occurrence);
        displayResult(occurrence);

    }
    public static void countOccurrences(int[] occurrences){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers between 1-100 : ");

        int i = input.nextInt();

        while(i != 0){
            if (i >= 1 && i <= 100) {
                occurrences[i - 1]++;
            }
            i = input.nextInt();
        }
    }
    public static void displayResult(int[] occurrences){
        for(int i = 0; i < occurrences.length; i++){
            if(occurrences[i] > 0){
                System.out.println((i + 1) + " occurs " + occurrences[i] + ((occurrences[i] > 1) ? " times " : " time "));
            }
        }
    }
}
