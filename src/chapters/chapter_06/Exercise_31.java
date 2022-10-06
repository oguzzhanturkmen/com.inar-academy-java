package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number :");
        String number = input.nextLine();

        if(isValid(number)){
            System.out.println(number + " is valid ");
        }
        else {
            System.out.println(number + " is not valid");
        }
    }
    public static boolean isValid(String number){
        return ((getSize(number) >= 13 && getSize(number) <= 16) && (((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) && prefixMatched(number)));
    }
    public static int sumOfDoubleEvenPlace(String number){
        int sum = 0;

        for (int i = number.length() - 2; i >= 0; i -= 2) {
            if (2 * Integer.parseInt(String.valueOf(number.charAt(i))) > 9) {
                sum += getDigit(Integer.parseInt(String.valueOf(number.charAt(i))) * 2);
            } else {
                sum += 2 * (Integer.parseInt(String.valueOf(number.charAt(i))));
            }
        }
        return sum;
    }
    public static int getDigit(int number){
        if(number > 9){
            return (number / 10) + (number % 10);
        }
        return number;
    }
    public static int sumOfOddPlace(String number){

        int sum = 0;

        for (int i = number.length() - 1; i >= 0; i -= 2){
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return sum;
    }
    public static boolean prefixMatched(String number){
        return (number.startsWith("4") || number.startsWith("5") || number.startsWith("37") || number.startsWith("6"));
    }
    public static int getSize(String d){
        return  d.length();
    }
}
