package chapters.chapter_12;

import java.io.File;

public class Exercise_26 {
    public static void main(String[] args) {

        File file = new File("Test2");
        file.mkdir();
        System.out.println("Dir " + ((file.exists()) ? "Created sucesfully" : "There is a problem"));
    }
}
