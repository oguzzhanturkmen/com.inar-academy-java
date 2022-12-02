package chapters.chapter_12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_18 {
    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.out.println("Wrong usage !!");
            System.exit(1);
        }
        File directory = new File(args[0]);
        if (!directory.isDirectory()) {
            System.out.println("No such directory !!");
            System.exit(2);
        }
        ArrayList<File> directories = new ArrayList<>();
        directories.add(directory);

        while (!directories.isEmpty()) {
            File file = directories.remove(0);
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                        directories.add(files[i]);
                    }
                    if (files[i].isFile()) {
                        changeName(files[i]);
                    }
                }
            }


        }
    }

    public static void changeName(File file) throws IOException {
        String str1 = file.getParent() + "." + file.getName();
        String str2 = "";
        try (
                Scanner input = new Scanner(file);

        ) {
            while (input.hasNext()) {
                str2 += input.nextLine();
            }
            PrintWriter output = new PrintWriter(file);
            output.println(str1);
            output.println("Check");
            output.println(str2);
            output.close();
        }
    }

}
