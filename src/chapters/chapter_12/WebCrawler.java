package chapters.chapter_12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
    public static void main(String[] args) {
        String url = "https://shiftdelete.net";
        crawler(url);

    }
    public static void crawler(String startingURL){
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);

        while(!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100){
            String urlString = listOfPendingURLs.remove(0);
            if(!listOfTraversedURLs.contains(urlString)){
                listOfTraversedURLs.add(urlString);

                System.out.println("Crawl " + urlString);

                for (String s: getSubURLs(urlString)){
                    if(!listOfTraversedURLs.contains(s)){
                        listOfPendingURLs.add(s);
                }
                }
            }
        }
    }
    public static ArrayList<String > getSubURLs(String urlString){

        ArrayList<String> list = new ArrayList<>();

        try{
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while(input.hasNext()){
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while(current > 0){
                    int endIndex = line.indexOf("\"", current );
                    if(endIndex > 0){
                        list.add(line.substring(current,endIndex));
                        current = line.indexOf("http:" , endIndex);
                    }
                    else{
                        current = -1;
                    }
                }
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (RuntimeException ex) {
            throw new RuntimeException("Can not reach the site");

        }
        return list;
    }
}
