package chapters.chapter_06;

public class Exercise_09 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s%-7s%-15s%-15s\n", "Feet", "Meters", "|", "Meters", "Feet");
        for (int i = 0; i < 60; i++) {
            System.out.print("_");
        }
        for (double i = 1, j = 20; i < 11 && j <= 65; i++, j += 5) {
            System.out.printf("\n%-15.3f%-15.3f%-7s%-15.3f%-15.3f", i, footToMeter(i), "|", j, meterToFoot(j));

        }
    }
    public static double footToMeter(double foot){
       double meter = 0.305 * foot;
       return meter;
    }
    public static double meterToFoot(double meter){
        double foot = 3.279 * meter;
        return foot;
    }


    }

