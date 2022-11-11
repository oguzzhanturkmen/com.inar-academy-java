package chapters.chapter_10;

import java.util.Arrays;

public class Exercise_25 {
    public static void main(String[] args) {

        String str = "Oguz#han#turk?men";
        String[] array = split(str,"#?");

        System.out.println(Arrays.toString(array));

    }
    public static String[] split(String s, String regex){
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < regex.length(); j++) {
                if(s.charAt(i) == regex.charAt(j)){
                    counter++;
                }
            }
        }
        String[] array = new String[counter + 1];
        String str = "";
        int arrayCounter = 0;


        for (int i = 0; i < s.length(); i++) {
            boolean check = true;
            for (int j = 0; j < regex.length(); j++) {
                if((s.charAt(i) == regex.charAt(j))){
                    check = false;

                }
            }
            if(check) {
                str += s.charAt(i);
            }
            else{
                array[arrayCounter] = str;
                arrayCounter++;
                str = "";
            }
        }
        array[arrayCounter] = str;
        return array;
    }
}
