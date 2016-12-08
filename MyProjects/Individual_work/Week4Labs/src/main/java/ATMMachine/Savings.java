/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATMMachine;

/**
 *
 * @author apprentice
 */
public class Savings extends Account {

    public Savings(double balance, String name) {
        super(balance, name);
    }

    public Savings() {
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public double withdrawl(double x) {
        System.out.println("NOTE: 10% penalty on withdrawls from this account. '0' to cancel.");
        this.balance = balance - x;
        System.out.println("$" + x + ", drawn from account.");
        System.out.println("$" + (x * .1) + " penalty applied.");
        return balance;
    }

    @Override
    public double deposit(double x) {
        this.balance = balance + x;
        if (x > 9999.99) {
            System.out.println("Bank management has been contacted to approve transaction.");
        }
        return balance;
    }

}
