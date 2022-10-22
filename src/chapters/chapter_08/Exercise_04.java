package chapters.chapter_08;

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] array = new int[8][7];
        Exercise_01.getInput(array);


    }


    public static double sumRow(int[][] m, int columnIndex) {
        int sum = 0;
        for (int i = 0; i < m[0].length; i++) {
            sum += m[columnIndex][i];
        }
        return sum;
    }
}