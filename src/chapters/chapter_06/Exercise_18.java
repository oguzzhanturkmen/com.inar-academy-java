package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your password " );
        String pass = input.nextLine();

        System.out.println("Your password is " + (isValid(pass) ? "valid" : "not valid"));
    }
    public static boolean isValid(String pass){
        return (pass.length() >= 8 && ConsistsLettersAndDigits(pass) && containsTwoDigits(pass));
    }
    public static boolean ConsistsLettersAndDigits(String pass){
        for(int i = 0; i < pass.length(); i++){
            if (!((pass.charAt(i) >= '0' && pass.charAt(i) <= '9') || (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') || (pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') )){
                return false;
            }
        }
        return true;
    }
    public static boolean containsTwoDigits(String pass){
        int counter = 0;

        for(int i = 0; i < pass.length(); i++){
            if(pass.charAt(i) >= '0' && pass.charAt(i) <= '9'){
                counter++;
            }
        }
        return (counter >= 2);

    }
}
