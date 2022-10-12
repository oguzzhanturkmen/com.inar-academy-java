package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of balls to drop : ");
        int numberOfBalls = input.nextInt();

        System.out.println("Enter the number of slots in the bean machine: ");
        int numberOfSlots = input.nextInt();

        int[] slots = new int[numberOfSlots];
        drawThePathAndGetTheArrayIndex(numberOfBalls, slots);
        drawSlots(slots);
        System.out.println(Arrays.toString(slots));




    }
    public static void drawThePathAndGetTheArrayIndex(int numberOfBalls,  int[] slots){
        String pathWay = "";
        int rightCount = 0;
        int path = 0;
        for(int i = 0; i < numberOfBalls ; i++){
            for(int j = 0; j < slots.length - 1; j++){
                path = (int)(Math.random() * 2 );
                if(path == 0){
                    pathWay += "L";
                }
                else{
                    pathWay += "R";
                    rightCount++;
                }
            }
            System.out.println(pathWay);
            if(rightCount > 0) {
                slots[rightCount]++ ;
            }
            else{
                slots[0]++;
            }
            pathWay = "";
            rightCount = 0;
        }
    }
    public static void drawSlots(int[] slots){
        int[] tempSlot = Arrays.copyOf(slots , slots.length);
        int maxSlot = findMax(slots);
        for(int i = 0; i < maxSlot - 1 ; i++){
            boolean actionTaken = false;
            for(int j = 0; j < slots.length ; j++){
                if(tempSlot[j] > 1){
                    System.out.print("0");
                    tempSlot[j]--;
                }else{
                    System.out.print(" ");
                }
                }
                System.out.print("\n");
            }


        for(int i = 0; i < tempSlot.length; i++){
            if(tempSlot[i] == 1){
                System.out.print("0");
            }if(tempSlot[i] == 0){
                System.out.print(" ");
            }
        }
    }
    public static int findMax(int[] array) {

        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
