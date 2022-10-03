package chapters.chapter_06;

public class Exercise_26 {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 2; counter < 101; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                counter++;
                System.out.printf("%-10d", i);
                if (counter % 10 == 0) {
                    System.out.println();
            }
            }
        }
    }
    public static int reverse(int number){

        String str = Integer.toString(number);
        String str2 = "";
        for(int i = str.length() - 1; i >= 0; i--){
            str2 += str.charAt(i);
        }
        number = Integer.parseInt(str2);
        return number;
    }
    public static boolean isPalindrome(int number){
        if(reverse(number) == number){
            return true;
        }
        else{
            return false;
        }

    }
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false; //
            }
        }
        return true; //
    }
}
