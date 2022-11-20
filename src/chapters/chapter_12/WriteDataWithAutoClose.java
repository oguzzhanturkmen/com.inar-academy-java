package chapters.chapter_12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws IOException {

        File file = new File("Oguz.txt");

        try(PrintWriter output = new PrintWriter(file);){

            output.print("oguz");
            output.println("deneme");

        }

    }
}
