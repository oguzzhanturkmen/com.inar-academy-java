package chapters.chapter_10;

public class Exercise_06 {
    public static void main(String[] args) {

        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 120; i > 1; i--) {
            boolean isPrime = true;
            for (int divisor = i / 2; divisor >= 2; divisor--) {
                if (i % divisor == 0) {
                    isPrime = false;
                    break;
                }
                }
            if(isPrime){
                stack.push(i);
            }
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
