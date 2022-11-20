package chapters.chapter_12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplacingText {
    public static void main(String[] args) throws IOException {

        if(args.length != 4){
            System.out.println("Need 4 parameters !!");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);

        if(!sourceFile.exists()){
            System.out.println("File does not exist !!");
            System.exit(2);
        }

        File targetFile  = new File(args[1]);

        if(targetFile.exists()){
            System.out.println("File already exists !!");
            System.exit(3);
        }

        try (
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile);
                ){
            while(input.hasNext()){

                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[2] , args[3]);
                output.println(s2);
            }

        }

    }
}
