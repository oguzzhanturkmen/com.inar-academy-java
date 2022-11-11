package chapters.chapter_10;

public class MyInteger {

    private int value;

    public MyInteger(int value) {
        this.value = value;
    }
    public MyInteger() {
        this(1);
    }

    public int getValue() {
        return value;
    }
    public boolean isEven(){
        return (value % 2 == 0);
    }
    public boolean isOdd(){
        return (value % 2 == 1);
    }
    public boolean isPrime(){
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(MyInteger number){
        return number.isEven();
    }
    public static boolean isOdd(MyInteger number){
        return (number.isOdd());
    }
    public static boolean isPrime(MyInteger number ){
           return number.isPrime();
    }
    public boolean equals(int number){
        return value == number;
    }
    public boolean equals(MyInteger number){
        return value == number.getValue();
    }
    public static int parseInt(char[] array){
        int sum = 0;
        int pow = 0;
        for (int i = array.length -1; i >= 0; i--) {
            sum += (array[i] - '0') * Math.pow(10, pow++);
        }
        return sum;
    }
    public static int parseInt(String str){
        int sum = 0;
        int pow = 0;
        for (int i = str.length() -1; i >= 0; i--) {
            sum += (str.charAt(i) - '0') * Math.pow(10, pow++);
        }
        return sum;

    }


}
