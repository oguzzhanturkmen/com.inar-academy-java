package chapters.chapter_12;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) throws Exception {

            //NOT WORKING PROPERLY
        File file = new File("Salary.txt");
        Scanner input = new Scanner(file);

        ArrayList<Double> assistant = new ArrayList<>();
        ArrayList<Double> associate = new ArrayList<>();
        ArrayList<Double> full = new ArrayList<>();

        while (input.hasNext()) {
            String[] str = input.nextLine().split(" ");
            getSalaries(assistant, associate, full, str[2], new Double(str[3]));
        }
        double totalAssistant = getSum(assistant);
        double totalAssociate = getSum(associate);
        double totalFull = getSum(full);

        System.out.println("Assistant : " + totalAssistant);
        System.out.println("Associate : " + totalAssociate);
        System.out.println("Full " + totalFull);
    }

    public static void getSalaries(ArrayList<Double> x, ArrayList<Double> y, ArrayList<Double> z, String str, Double money) {
        if (str.equals("assistant")) {
            x.add(money);
        } else if (str.equals("associate"))
            y.add(money);
        else if (str.equals("full"))
            z.add(money);
    }

    public static double getSum(ArrayList<Double> a) {
        double x = 0;
        for (int i = 0; i < a.size(); i++) {
            x += a.get(i);
        }
        return x;


    }
}
