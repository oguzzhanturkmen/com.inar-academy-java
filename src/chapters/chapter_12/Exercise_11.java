package chapters.chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Enter the parameters correctly !!");
            System.exit(1);
        }
        File file = new File(args[1]);
        if(!file.exists()){
            System.out.println("File does not exist!!!");
            System.exit(2);
        }
        File newFile = new File("output.txt");
        Scanner input = new Scanner(args[1]);
        try {
            PrintWriter output = new PrintWriter(newFile);
            while(input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[0], "");
                output.println(s2);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        }
    }

