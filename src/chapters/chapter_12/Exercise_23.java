package chapters.chapter_12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) throws Exception {

        ArrayList<Double> list = new ArrayList<>();

        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                list.add(input.nextDouble());
            }
        } catch (MalformedURLException ex) {
            System.out.println("Invalid url");
        } catch (IOException ex2) {
            System.out.println("Problem about file ");
        }
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        double average = total / list.size();
        System.out.println("Average is : " + average);
    }
}

