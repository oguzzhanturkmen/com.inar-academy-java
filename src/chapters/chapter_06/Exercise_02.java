package chapters.chapter_06;

public class Exercise_02 {
    public static void main(String[] args) {

        System.out.println(sumDigits(12345));
    }

    public static int sumDigits(long n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
