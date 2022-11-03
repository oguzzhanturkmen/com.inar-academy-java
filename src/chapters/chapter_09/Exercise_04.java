package chapters.chapter_09;

public class Exercise_04 {
    public static void main(String[] args) {

        java.util.Random randomNumber = new java.util.Random(1000);

        for (int i = 1; i <= 50; i++) {
                System.out.printf("%5d", randomNumber.nextInt(100));
            if (i % 10 == 0){
                System.out.println();
            }
        }
    }

}
