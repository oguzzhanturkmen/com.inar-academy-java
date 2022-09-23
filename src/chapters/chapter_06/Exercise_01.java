package chapters.chapter_06;

public class Exercise_01 {
    public static void main(String[] args) {

        for(int i = 1; i < 101; i++){
            System.out.printf("%7d" , getPentagonalNumber(i) );
            if(i % 10 == 0){
                System.out.println();
            }
        }

    }

    public static int getPentagonalNumber(int n){
        int pentagonalNumber = n * (3 * n - 1) / 2;
        return pentagonalNumber;
    }
}
