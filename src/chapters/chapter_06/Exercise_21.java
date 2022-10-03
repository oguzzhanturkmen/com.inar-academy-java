package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                System.out.print(getNumber(str.charAt(i)));
            }
            else{
                System.out.print(str.charAt(i));
            }
        }


    }
    public static int getNumber(char ch){
        ch = Character.toUpperCase(ch);

        int number = 0;

            if (ch >= 'W')
                number = 9;
            else if (ch >= 'T')
                number = 8;
            else if (ch >= 'P')
                number = 7;
            else if (ch >= 'M')
                number = 6;
            else if (ch >= 'J')
                number = 5;
            else if (ch >= 'G')
                number = 4;
            else if (ch >= 'D')
                number = 3;
            else if (ch >= 'A')
                number = 2;

        return number;
        }

    }

