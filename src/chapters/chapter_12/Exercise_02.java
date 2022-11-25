package chapters.chapter_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers : ");

        while(true) {

            try {
                int n1 = input.nextInt();
                int n2 = input.nextInt();
                System.out.println("Sum is " + (n1 + n2));
                break;
            }

            catch (InputMismatchException ex){
                System.out.println("Wrong input type !!!");
                System.out.println("Try again");
                input.nextLine();
            }
        }
    }
}
