package chapters.chapter_12;

import java.io.File;
import java.util.Scanner;

public class Exercise_30 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the file ");
        String fileName = input.nextLine();

        File file = new File(fileName);


        int[] letters = new int[26];

        try(
                Scanner inputFile = new Scanner(file);
                ){
            while(inputFile.hasNext()){
                String line = inputFile.nextLine().toUpperCase();
                countLetters(letters , line);
            }
        }
        for (int i = 0; i < letters.length; i++) {
            System.out.println("Number of " + (char)('A' + i) + "\'s: " + letters[i]);
        }
    }
    public static void countLetters(int[] letters, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                letters[(int)(str.charAt(i) - 'A')]++;
        }
    }
}
