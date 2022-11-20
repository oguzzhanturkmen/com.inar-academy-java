package chapters.chapter_12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws IOException {

        File file = new File("GitLesson.txt");
        Scanner input = new Scanner(file);

        while(input.hasNext()){
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();



    }
}
