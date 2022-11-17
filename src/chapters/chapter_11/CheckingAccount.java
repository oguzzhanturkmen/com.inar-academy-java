package chapters.chapter_11;

import chapters.chapter_09.Account;

public class CheckingAccount extends Account {

    private double overDraftLimit;

    public CheckingAccount() {
        super();
        overDraftLimit = -100;
    }

    public CheckingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
        overDraftLimit = -100;
    }

    public CheckingAccount(int id, double balance, double annualInterestRate, double overDraftLimit) {
        super(id, balance, annualInterestRate);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double money) {
        if (getBalance() - money > overDraftLimit) {
            setBalance(getBalance() - money);
        } else {
            System.out.println("Cant withdraw money, (over limits!)");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "SavingsAccount{" +
                "overDraftLimit=" + overDraftLimit +
                '}';
    }
}
