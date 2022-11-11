package chapters.chapter_10;

public class Exercise_03 {
    public static void main(String[] args) {

        MyInteger num1 = new MyInteger(10);
        MyInteger num2 = new MyInteger(11);
        String str = "12";

        System.out.println(num1.isEven() + " " + num1.isOdd() + " " + num1.isPrime() + " " + num1.equals(num2) + " " +  MyInteger.parseInt(str));
        System.out.println(num2.isEven() + " " + num2.isOdd() + " " + num2.isPrime() + " " + num2.equals(num1) +  " " + MyInteger.parseInt(str));
    }
}
