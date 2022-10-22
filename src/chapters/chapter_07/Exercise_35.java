package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_35 {

    //Not working properly
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"write", "that", "hangman", "game", "water", "moon"};
        boolean wannaPlay = true;

        while (wannaPlay == true) {
            int counter = 0;
            int missCount = 0;
            String word = words[(int) (Math.random() * words.length)];
            char[] wordArray = word.toCharArray();
            char[] guessArray = new char[wordArray.length];
            fillArrayWithAsterisk(guessArray);
            while (counter < guessArray.length) {
                System.out.print("Enter a letter in word >" + Arrays.toString(guessArray) + " >");
                char ch = input.next().charAt(0);

                for (int i = 0; i < wordArray.length; i++) {
                    if (ch == wordArray[i]) {
                        if (guessArray[i] == ch) {
                            System.out.println(ch + "is already in word ");
                            continue;
                        }
                        guessArray[i] = wordArray[i];
                        counter++;

                    } else {
                        missCount++;
                        counter++;
                    }
                }

            }
            System.out.println("The word is " + Arrays.toString(words) + " You missed " + missCount + " time ");

            System.out.println("Do you want to guess another word ? Enter y or n ");
            char ch = input.next().charAt(0);
            if (ch != 'y') {
                wannaPlay = false;
            }
        }
    }







        public static void fillArrayWithAsterisk(char[] ch ){
        for(int i = 0; i < ch.length; i++){
            ch[i] = '*';
        }
    }
}
