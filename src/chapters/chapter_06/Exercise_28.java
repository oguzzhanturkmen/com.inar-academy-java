package chapters.chapter_06;

public class Exercise_28 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n" , "p" , "2^p-1");
        System.out.println("---------------------------");

        for(int i = 2; i < 32; i++){
            if(isPrime(i) && isPrime(formula(i))){
                System.out.printf("%-10d%-10d" , i , formula(i));
                System.out.println();
            }
        }

    }
    public static int formula(int i){
        return (int)(Math.pow(2 , i) - 1);
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
