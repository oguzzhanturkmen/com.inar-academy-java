package chapters.chapter_12;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String value = input.nextLine();

        try{
            System.out.println("Dec value  is " + binToDec(value));
        }
        catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }

    }

    public static int binToDec(String value) throws NumberFormatException {
        int result = 0;
        int pow = value.length() - 1;

        for (int i = 0; i < value.length(); i++) {
            if (!(value.charAt(i) == '1' || value.charAt(i) == '0')) {
                throw new NumberFormatException("Wrong binary value");
            }
            result += Math.pow(2, pow--) * Integer.parseInt(value.charAt(i) + "");
        }
        return result;
    }
}
