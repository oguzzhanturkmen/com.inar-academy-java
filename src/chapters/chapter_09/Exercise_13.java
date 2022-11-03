package chapters.chapter_09;

public class Exercise_13 {
    public static void main(String[] args) {


        double[][] array = chapters.chapter_08.Exercise_13.getInput();

        Location loc = Location.locateLargest(array);

        System.out.println("Largest element is " + loc.maxValue + " at " + loc.row + "," + loc.column);

    }
}
