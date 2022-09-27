package chapters.chapter_06;

public class Exercise_14 {
    public static void main(String[] args) {

        System.out.printf("%-15s%s\n", "i", "m(i)");
        System.out.println("-------------------------");

        for (int i = 1; i < 902; i+= 100) {
            System.out.printf("%-15d%.4f\n", i, computePi(i));
        }
    }
        public static double computePi(int i){
            double result = 0;
            for(double j = 1; j <= i; j++){
                result += Math.pow(-1 ,j + 1 ) / (2 * j - 1);
            }
            return 4 * result;
        }
}
