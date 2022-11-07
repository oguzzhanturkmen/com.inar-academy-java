package chapters.chapter_10;

import chapters.chapter_09.Account;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        atmWorks();
    }

    public static void displayMenu() {
        System.out.print("Main menu\n" +
                "1: check balance\n" +
                "2: withdraw\n" +
                "3: deposit\n" +
                "4: exit\n" +
                "Enter a choice:");
    }

    public static int getId() {
        Scanner input = new Scanner(System.in);
        boolean checkId = true;
        while (checkId) {
            int id = input.nextInt();
            if (id < 0 || id > 9) {
                System.out.println("Wrong id, please enter the correct id ! ");
            } else {
                checkId = false;
                return id;
            }
        }
        return -1;
    }

    public static int getChoice() {
        Scanner input = new Scanner(System.in);
        boolean checkChoice = true;
        displayMenu();
        while (checkChoice) {
            int choice = input.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Wrong choice, please enter the correct choice ! ");
            } else {
                checkChoice = false;
                return choice;
            }
        }
        return -1;
    }

    public static boolean process(int id, int choice, Account[] array) {
        Scanner input = new Scanner(System.in);
        boolean checkEnd = true;

        switch (choice) {
            case 1:
                System.out.println("The balance is : " + array[id].getBalance());
                break;
            case 2:
                System.out.println("Enter an amount to withdraw : ");
                array[id].withdraw(input.nextDouble());
                break;
            case 3:
                System.out.println("Enter an amount to deposit : ");
                array[id].deposit(input.nextDouble());
                break;
            case 4:
                System.out.println("Goodbye");
                checkEnd = false;
                break;
        }
        return checkEnd;
    }

    public static void atmWorks() {
        Account[] accounts = createAccount();

        while (true) {
            System.out.println("Please enter your id : ");
            int id = getId();
            while (process(id, getChoice(), accounts)) {

            }
        }
    }

    public static Account[] createAccount() {
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100, 0);
        }
        return accounts;
    }
}
