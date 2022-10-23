package chapters.chapter_08;

public class Exercise_18 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        Exercise_10.displayArray(array);
        System.out.println("----------------------");
        shuffleMatrix(array);
        Exercise_10.displayArray(array);

    }
    public static void shuffleMatrix(int[][] array) {
        int[] temp ;
        int n;

        for (int i = 0; i < array.length; i++) {
            n = (int) (Math.random() * array.length);
            temp = array[i];
            array[i] = array[n];
            array[n] = temp;
        }

    }
}
