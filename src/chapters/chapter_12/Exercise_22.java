package chapters.chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_22 {
    public static void main(String[] args) throws Exception {

        String directory = "Test";
        File file = new File(directory);
        if(!file.isDirectory()){
            System.out.println("Not a directory !!");
            System.exit(1);
        }
        File[] array = file.listFiles();

        for (int i = 0; i < array.length; i++) {
            replaceText(array[i] , "git" , "oguz");
        }

    }
    public static void replaceText(File src , String oldString , String newString) throws Exception{

        File file = src;

        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(2);
        }
        ArrayList<String> list = new ArrayList<>();

        try (
                Scanner input = new Scanner(file);

        ) {
            while (input.hasNext()) {
                String str1 = input.nextLine().replaceAll(oldString, newString);
                list.add(str1);
            }
        }
        PrintWriter output = new PrintWriter(file);
        for (int i = 0; i < list.size(); i++) {
            output.println(list.get(i));
        }
        output.close();
    }
}
