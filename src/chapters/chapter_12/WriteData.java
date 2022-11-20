package chapters.chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException {


        File file = new File("deneme.txt");
        if (file.exists()) {
            System.out.println("File already exists !!");
            System.exit(1);
        } else {

            PrintWriter output = new PrintWriter(file);

            output.println("Deneme 1 2 3 ");
            output.print("Oguzhan");
            output.print(12);

            output.close();

        }

    }
}
