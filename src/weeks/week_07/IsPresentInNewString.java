package weeks.week_07;

import java.util.Scanner;

public class IsPresentInNewString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings : ");
        String str1 = input.nextLine();
        String str2 = input.nextLine();

        System.out.println("Given strings are :" + str1 + " -- " + str2 + "\nEdited string is : " + editString(str1, str2));
        change(str1);
        System.out.println(str1);
    }

    public static String editString(String str1, String str2) {
        String outputStr = "";

        for (int i = 0; i < str1.length(); i++) {
            boolean isTrue = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                outputStr += str1.charAt(i);
            }
        }
        return outputStr;
    }
    public static void change(String s){
        s = "oguz";

    }

}
