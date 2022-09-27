package chapters.chapter_06;

public class Exercise_13 {
    public static void main(String[] args) {

        System.out.printf("%-15s%s\n" , "i" , "m(i)");
        System.out.println("-------------------------");

        for(int i = 1; i < 21; i++){
            System.out.printf("%-15d%.4f\n" , i , computeM(i));
        }

    }
    public static double computeM(int i){
        double result = 0;
        for(double j = 1; j <= i; j++){
            result += j / (j + 1);
        }
        return result;
    }
}
