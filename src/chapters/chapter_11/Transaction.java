package chapters.chapter_11;

import java.util.Date;

public class Transaction {

    private java.util.Date date;
    private char type;

    private double amount;
    private double balance;
    private String description;

    public Transaction( char type, double amount, double balance, String description) {
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                "\n, type=" + type +
                "\n, amount=" + amount +
                "\n, balance=" + balance +
                "\n, description='" + description + '\'' +
                '}' + "\n ------------------\n";
    }
}
