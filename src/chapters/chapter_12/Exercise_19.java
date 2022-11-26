package chapters.chapter_12;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) throws Exception {
        String urlStr = "https://github.com/oguzzhanturkmen/com.inar-academy-java/blob/main/README.md";
        URL url = new URL(urlStr);
        int counter = 0;
        try (
                Scanner input = new Scanner(url.openStream());
        ) {
            while(input.hasNext()){
                String s = input.next();
                counter++;
        }
    }
        System.out.println(counter);
    }
}
