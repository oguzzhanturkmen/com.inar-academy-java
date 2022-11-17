package chapters.chapter_11;

import java.util.ArrayList;

public class Exercise_12 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        list.add(2.0);
        list.add(1.0);
        list.add(9.0);
        list.add(7.1);
        list.add(3.2);
        list.add(4.3);
        System.out.println(list);
        System.out.println("Sum is : " + sum(list));

    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
