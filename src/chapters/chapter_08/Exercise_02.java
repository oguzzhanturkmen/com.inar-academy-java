package chapters.chapter_08;

public class Exercise_02 {
    public static void main(String[] args) {

        double[][] array = new double[4][4];
        Exercise_01.getInput(array);

        System.out.println("Sum of the elemnts in major diagonal is " + sumMajorDiagonal(array));

    }
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for(int i = 0; i < m.length; i++){
            sum += m[i][i];
        }
        return sum;
    }
}
