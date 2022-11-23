package chapters.chapter_12;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();

        try {
            System.out.println("Dec value  is " + binToDec(value));
        } catch (HexFormatException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public static int binToDec(String value) throws HexFormatException {
        int result = 0;
        int pow = value.length() - 1;

        for (int i = 0; i < value.length(); i++) {
            if (!(value.charAt(i) == '1' || value.charAt(i) == '0')) {
                throw new HexFormatException(value);
            }
            result += Math.pow(2, pow--) * Integer.parseInt(value.charAt(i) + "");
        }
        return result;
    }
}

