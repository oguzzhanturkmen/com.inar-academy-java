package chapters.chapter_12;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {

        int length = 999999999;

        try {
            int[] array = new int[length];
        }
        catch (OutOfMemoryError err){
            System.out.println("Cant do that !!");
        }


    }
}
