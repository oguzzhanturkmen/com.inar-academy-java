package chapters.chapter_06;

public class Exercise_10 {
    public static void main(String[] args) {
        for (int i = 2; i < 1001; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }


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
