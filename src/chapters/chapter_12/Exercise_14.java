package chapters.chapter_12;

import java.io.File;
import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a file :");
        File file = new File(input.nextLine());

        if (!file.exists()) {
            System.out.println("File  does not exist");
            System.exit(1);
        }

        int count = 0;
        double total = 0;
        try(
                Scanner inputFile = new Scanner(file);
                ) {

            while (inputFile.hasNext()) {
                count++;
                total += inputFile.nextDouble();
            }
        }
        System.out.println("Total = " + total);
        System.out.println("Average = " + total / count);
    }
}
