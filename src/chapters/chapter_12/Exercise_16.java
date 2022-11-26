package chapters.chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("Wrong usage");
            System.exit(1);
        }
        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(2);
        }
        File newFile = new File("EditedText.txt");

        try (
                Scanner input = new Scanner(file);
                PrintWriter output = new PrintWriter(newFile);
        ) {
            while (input.hasNext()) {
                String str1 = input.nextLine();
                String str2 = str1.replaceAll(args[1], args[2]);
                output.println(str2);
            }
        }
    }
}
