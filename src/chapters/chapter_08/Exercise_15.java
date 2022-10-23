package chapters.chapter_08;

public class Exercise_15 {
    public static void main(String[] args) {

        double[][] array = new double[5][2];
        Exercise_01.getInput(array);
        System.out.println("The five points are " + (sameLine(array) ? "  on the same line " : " not on the same line "));
    }
    public static boolean sameLine(double[][] points) {
        return (((points[1][0] - points[0][0]) * (points[2][1] - points[0][1])) - ((points[2][0] - points[0][0]) * (points[1][1] - points[0][1])) == 0
                && ((points[3][0] - points[2][0]) * (points[4][1] - points[2][1])) - ((points[4][0] - points[2][0]) * (points[3][1] - points[2][1])) == 0 );
    }
}
