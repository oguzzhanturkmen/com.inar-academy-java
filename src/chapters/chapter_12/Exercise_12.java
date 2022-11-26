package chapters.chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Wrong usage");
            System.exit(1);
        }
        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(2);
        }

        String str1 = "";
        String str2 = "";
        ArrayList<String> list = new ArrayList<>();


        try (
                Scanner input = new Scanner(file);
        ) {
            str1 = input.nextLine();
            while(input.hasNext()){
                str2 = input.nextLine();
                if((str2.length() > 0) && (str2.charAt(str2.length() - 1) == '{' )){
                    list.add(str1.concat("{"));
                    str1 = input.nextLine();
                }
                else{
                    list.add(str1);
                    str1 = str2;
                }
            }
            list.add(str1);
        }
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < list.size(); i++) {
                output.println(list.get(i));
            }
        }
    }
}
