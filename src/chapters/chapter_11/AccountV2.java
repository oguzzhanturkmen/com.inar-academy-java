package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Date;

public class AccountV2 {

    private int id;
    private String name;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    private ArrayList<Transaction> transactions ;

    public AccountV2() {
        this(0, "NotIdentified", 0, 0);
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountV2(int id, String name, double balance, double annualInterestRate) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double money) {
        transactions.add(new Transaction('W',money,balance - money,"Withdraw money"));
        balance -= money;
    }

    public void deposit(double money) {
        transactions.add(new Transaction('D',money,balance + money,"Deposit money"));
        balance += money;
    }

    @Override
    public String toString() {
        return "Account" +
                "\nid=" + id +
                "\n, balance=" + balance +
                "\n, annualInterestRate=" + annualInterestRate +
                "\n, dateCreated= " + dateCreated +
                 "\n" + transactions.toString() + "\n" ;

    }
}

