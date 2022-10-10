package soruCozumu;

import java.util.Scanner;

public class Exercise_07_03 {
    public static void main(String[] args) {

        int[] occurrences = new int[100];

        countOccurences(occurrences);
        displayResult(occurrences);
    }
    public static void countOccurences(int[] occurrences){
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("Enter the integers between 1 and 100 : ");

        do{
            i = input.nextInt();

            if(i >= 1 && i <= 100){
                occurrences[i - 1]++;
            }
        }while(i != 0);
    }
    public static void displayResult(int[] occurrences){
        for(int i = 0; i < occurrences.length; i++){
            if(occurrences[i] > 0){
                System.out.println((i + 1) + " occurs " + occurrences[i ] + " time" + ((occurrences[i] > 1) ? "s" : ""));
            }
        }
    }
}
