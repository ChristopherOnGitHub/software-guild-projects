/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATMMachine;

import java.util.List;

/**
 *
 * @author apprentice
 */
public class ATMController {

    private ConsoleIO console;
    private ATMDao dao;

    public void run() {
        int PIN = 1234;
        int Attempts = 0;
        int userPIN;
        int x;

        console = new ConsoleIO();
        dao = new ATMDao();

        List<Account> accounts = dao.accountData();

        System.out.println("WELCOME TO FLOYD FIRST BANK");
        System.out.println("PLEASE ENTER YOUR PIN NUMBER:");
        do {
            userPIN = console.readInt("", 0000, 9999);
            Attempts = Attempts++;
        } while (Attempts > 10 || userPIN != PIN);

        do {
            if (Attempts >= 10) {
                console.print("You Have Been Locked Out Of The System.");
                x = 0;
            } else {
                x = accountMenu();
            }

            switch (x) {
                case 0:
                    System.out.println("Goodbye.");
                    break;
                case 1:
                    listAll(accounts);
                    break;
                case 2:
                    accountWithdrawl(accounts);
                    break;
                case 3:
                    accountDeposit(accounts);
                    break;

            }
        } while (x != 0);
    }

    public int accountMenu() {
        System.out.println(" ");
        System.out.println("SUCCESSFUL LOG IN, WELCOME!");
        System.out.println("WHICH ACCOUNT WOULD YOU LIKE TO ACCESS?");
        System.out.println("0. Quit");
        System.out.println("1. List all open accounts");
        System.out.println("2. Withdraw from an account");
        System.out.println("3. Make a deposit into an account");
        int x = console.readInt("please make a selection", 0, 3);
        System.out.println(" ");

        return x;
    }

    public void listAll(List<Account> accounts) {
        for (Account i : accounts) {
            System.out.println(i.name + ": $" + i.balance);
        }
    }

    public void accountWithdrawl(List<Account> accounts) {
        String x = console.readString("Enter name of account you want to withdraw from");
        for (Account i : accounts) {
            if (x.equalsIgnoreCase(i.name)) {
                if (i.balance > 0) {
                    i.withdrawl();
                } else if (i.balance <= 0) {
                    System.out.println("You may not make a"
                            + "withdrawl from an overdrafted account");
                }
            }
        }
    }

    public void accountDeposit(List<Account> accounts) {
        String x = console.readString("Enter name of account you want to make a deposit into");
        for (Account i : accounts) {
            if (x.equalsIgnoreCase(i.name)) {
                i.deposit();
            }
        }
    }
}
