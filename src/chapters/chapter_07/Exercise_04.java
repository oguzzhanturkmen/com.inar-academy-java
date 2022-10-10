package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        int[] scoreArray = new int[100];

        determineWhat(scoreArray);
    }
    public static void getScores(int[] scoreArray){

        Scanner input = new Scanner(System.in);
        Arrays.fill(scoreArray , -1);
        System.out.println("Enter scores ( -1 to exit)");

        for(int i = 0; i < scoreArray.length; i++){
            int x = input.nextInt();
            if(x == -1){
                break;
            }
            scoreArray[i] = x;
        }
    }
    public static void determineWhat(int[] scoreArray){
        getScores(scoreArray);
        int sum = 0;
        int counter = 0;

        while(scoreArray[counter] >= 0){
            sum += scoreArray[counter];
            counter++;
        }
        int average = sum / counter;
        int aboveCounter = 0;
        int equalCounter = 0;
        int belowCounter = 0;

        for(int i = 0; i < counter; i++){
            if(scoreArray[i] > average){
                aboveCounter++;
            }
            else if ( scoreArray[i] == average){
                equalCounter++;
            } else if (scoreArray[i] < average) {
                belowCounter++;
            }
        }
        System.out.println("Above the average :" + aboveCounter);
        System.out.println("Equals to the average :" + equalCounter);
        System.out.println("Below the average :" + belowCounter);
    }

}
