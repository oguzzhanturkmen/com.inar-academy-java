package chapters.chapter_11;

import chapters.chapter_09.Account;

public class Exercise_03 {
    public static void main(String[] args) {
        Account account = new Account(1,2000,100);
        SavingsAccount savingsAccount= new SavingsAccount(2,3000,100);
        CheckingAccount checkingAccount =new CheckingAccount(3,10000,100,-500);

        System.out.println(account);
        System.out.println(savingsAccount);
        System.out.println(checkingAccount);
    }
}
