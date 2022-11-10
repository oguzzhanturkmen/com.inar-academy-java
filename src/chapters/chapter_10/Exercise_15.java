package chapters.chapter_10;

import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {

        double[][] array = getInput();
        MyRectangle2D rect = MyRectangle2D.getRectangle(array);

        System.out.println("center :" + rect.getX() + "," + rect.getY() + " width: " + rect.getWidth() + " height : " + rect.getHeight());

    }

    public static double[][] getInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter points :  ");
        double[][] array = new double[5][2];

        for (int i = 0; i < array.length; i++) {
            array[i][0] = input.nextDouble();
            array[i][1] = input.nextDouble();
        }
        return array;

    }

}
