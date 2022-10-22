package chapters.chapter_08;

public class Exercise_06 {
    public static void main(String[] args) {

        double[][] array1 = new double[3][3];
        double[][] array2 = new double[3][3];
        Exercise_01.getInput(array1);
        Exercise_01.getInput(array2);

        double[][] result = multiplyMatrix(array1 , array2);
        System.out.println("The matrices are added as follows ");

        for (int i = 0; i < result.length; i++) {
            Exercise_05.print(array1, i);
            System.out.print((i == 1 ? "   *   " : "       "));
            Exercise_05.print(array2, i);
            System.out.print((i == 1 ? "   =   " : "       "));
            Exercise_05.print(result, i);
            System.out.println();
        }
    }
    public static double[][] multiplyMatrix(double[][] array1, double[][] array2) {

        double[][] result = new double[array1.length][array2[0].length];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                for (int i = 0; i < result.length; i++) {
                    result[row][col] += array1[row][i] * array2[i][col];
                }
            }
        }
        return result;
    }
}
