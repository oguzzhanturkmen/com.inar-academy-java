package chapters.chapter_12;

import java.io.File;
import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) throws Exception{

        File file = new File("Strings.txt");

        if (!file.exists()) {
            System.out.println(file.getName() + " does not exist");
            System.exit(0);
        }
        boolean check = true;
        String str1 = "";
        String str2 = "";

        try (
                Scanner input = new Scanner(file);
        ) {
            if (input.hasNext())
                str1 = input.next();
            while (input.hasNext() && check) {
                str2 = input.next();

                if (str1.compareTo(str2) > 0) {
                    System.out.println( str1 + " and " + str2 + " are out of order");
                    check = false;
                }
                str1 = str2;
            }
            if (check) {
                System.out.println("Strings are sorted ");
            }
        }
    }
}
