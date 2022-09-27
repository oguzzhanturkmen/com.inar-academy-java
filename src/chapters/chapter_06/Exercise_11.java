package chapters.chapter_06;

public class Exercise_11 {
    public static void main(String[] args) {

        System.out.printf("%-15s %11s\n", "Sales Amount", "Commission");
        for(int i = 0; i < 30; i++){
            System.out.print("-");
        }
        System.out.println();
        for (int i = 10000; i <= 100000; i += 5000) {
            System.out.printf("%-15d %10.1f\n", i, computeCommission(i));
        }

    }
    public static double computeCommission(double salesAmount){
        double commission;
        if (salesAmount < 5001) {
            commission = salesAmount * 0.08;

        } else if (salesAmount < 10001) {
            salesAmount -= 5000;
            commission = (5000 * 0.08) + (salesAmount * .10);

        } else{
            commission = (5000 * 0.08);
            salesAmount -= 5000;

            commission += (5000 * .10);
            salesAmount -= 5000;

            commission += salesAmount * 0.12;
        }
        return commission;

    }
}
