package chapters.chapter_12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) {

        String URLString = "https://tr.wikipedia.org/wiki/Gustav_Klimt";

        try{
            URL url = new URL(URLString);
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                if (line.startsWith("<p")) {
                    System.out.println(line);
                }
            }
        }
        catch (MalformedURLException ex){
            System.out.println("Invalid URL");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
