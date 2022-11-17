package chapters.chapter_11;

import chapters.chapter_09.Account;

public class Exercise_08 {
    public static void main(String[] args) {
        AccountV2 account = new AccountV2(1122,"George" , 1000,1.5);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println(account.toString());
    }
}
