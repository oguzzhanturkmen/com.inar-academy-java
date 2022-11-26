package chapters.chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) throws Exception {

        File file = new File("Exercise12_15.txt");

        if(file.exists()){
            System.out.println("It already exists !!");
            System.exit(1);
        }
        try (
            PrintWriter output = new PrintWriter(file);
        ){
            for (int i = 0; i < 100; i++) {
                output.print((int)(Math.random() * 100));
                output.print(" ");
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        try(
        Scanner input = new Scanner(file);
        ){
            while(input.hasNext()){
                list.add(input.nextInt());
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
