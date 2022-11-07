package chapters.chapter_10;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = input.nextInt();
        StackOfIntegers stack = new StackOfIntegers();

        int n = 2;
        while(number != 1) {
            if(number % n == 0) {
                stack.push(n);
                number /= n;
            }
            else {
                n++;
            }
        }
        while (!stack.empty()) {
            System.out.println(stack.pop() );
        }
    }
}
