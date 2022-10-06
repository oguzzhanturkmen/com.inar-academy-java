package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number and width");
        int number = input.nextInt();
        int width = input.nextInt();

        System.out.println(format(number , width));

    }
    public static boolean checkLength(int number, int width){
        return number > width;
    }
    public static String format(int number, int width){

        if(checkLength(number , width)) {
            String str = "";

            for (int i = 0; i < width - String.valueOf(number).length(); i++) {
                str += "0";
            }
            return str + String.valueOf(number);
        }
        else{
            return (String.valueOf(number));

        }
    }
}
