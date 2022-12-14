package chapters.chapter_09;

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        this(0 , 0 , 0);
        dateCreated = new Date();
    }
    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
    }
    public int getId(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public String getDateCreated(){
        return dateCreated.toString();
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest(){
        return balance * (getMonthlyInterestRate() / 100);
    }
    public void withdraw(double money){
        balance -= money;
    }
    public void deposit(double money){
        balance += money;
    }
}
