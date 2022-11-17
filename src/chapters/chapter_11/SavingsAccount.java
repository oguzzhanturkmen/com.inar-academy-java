package chapters.chapter_11;

import chapters.chapter_09.Account;

public class SavingsAccount extends Account {

    public SavingsAccount() {
    }

    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double money) {
        if(getBalance() - money < 0){
            System.out.println("Can not withdraw this amount !");
        }
        else{
            setBalance(getBalance() - money);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (SavingsAccount)";
    }
}
