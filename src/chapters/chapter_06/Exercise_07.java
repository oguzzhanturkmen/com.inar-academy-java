package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The amount invested : ");
        double investmentAmount = input.nextDouble();
        System.out.println("Annual interest rate ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;
        System.out.printf("%-10s%-10s\n" , "Years" , "Future Value");
        for(int i = 1; i < 31; i++){
            System.out.printf("%-10d%-10f\n" , i , futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
        }

    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){

        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate , years * 12);
        return futureValue;
    }
}
