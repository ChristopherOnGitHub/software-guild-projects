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

    private ConsoleIO console = new ConsoleIO();

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
    public double withdrawl() {
        console.print("NOTE: 10% penalty on withdrawls from this account. '0' to cancel.");
        double x = console.readDouble("How much to withdraw?", 0, balance);
        this.balance = balance - x;
        console.print("$" + x + ", drawn from account.");
        console.print("$" + (x * .1) + " penalty applied.");
        console.print(" ");
        return balance;
    }

    @Override
    public double deposit() {
        double x = console.readDouble("How much would you like to deposit?", 0, 1000000);
        this.balance = balance + x;
        if (x > 9999.99) {
            console.print("Bank management has been contacted to approve transaction.");
        }
        console.print(" ");
        return balance;
    }

}
