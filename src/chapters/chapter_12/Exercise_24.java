package chapters.chapter_12;

import java.io.File;
import java.io.PrintWriter;

public class Exercise_24 {
    public static void main(String[] args) throws Exception {
        File file = new File("Salary.txt");

        if (file.exists()) {
            System.out.println("File " + file.getName() + " already exists");
            System.exit(0);
        }
        String rank = "";
        double salary;
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 1; i <= 1000; i++) {
                output.print("FirstName" + i + " LastName" + i);
                rank = getRank();
                salary = getSalary(rank);
                output.print(" " + rank);
                output.println("  " + salary);
            }
        }
    }

    public static String getRank() {
        String[] ranks = {"assistant", "associate", "full"};
        return ranks[(int) (Math.random() * ranks.length)];
    }

    public static double getSalary(String rank) {
        if (rank.equals("assistant"))
            return 50000 + (double) (Math.random() * 30001);
        else if (rank.equals("associate"))
            return 60000 + (double) (Math.random() * 50001);
        else
            return 75000 + (double) (Math.random() * 55001);
    }
}

