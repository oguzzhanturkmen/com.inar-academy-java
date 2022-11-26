package chapters.chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_13 {

        public static void main(String[] args) throws Exception {
            if (args.length != 1) {
                System.out.println("Usage: java Exercise12_13 filaName");
                System.exit(1);
            }

            File file = new File(args[0]);
            if (!file.exists()) {
                System.out.println("There isn't any file like " + args[0]);
                System.exit(2);
            }

            String s = "";
            int countWord = 0;
            int countLine = 0;
            int countCharacters = 0;
            try (
                    Scanner input = new Scanner(file);
                    PrintWriter output = new PrintWriter(file);

            ) {
                while (input.hasNext()) {
                    s = input.nextLine();
                    countLine++;
                    countCharacters += countNumberOfChars(s);
                    countWord += countNumberOfWords(s);
                }
            }
            System.out.println("Number of words: " + countWord +
                    "\nNumber of Lines: " + countLine +
                    "\nNumber of Characters: " + countCharacters);
        }

        private static int countNumberOfChars(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (!(s.charAt(i) == ' ') && !(s.charAt(i) == '\n')) {
                    count++;
                }
            }
            return count;
        }

        private static int countNumberOfWords(String s) {
            String[] arr = s.split(" ");
            return arr.length;
        }
}
