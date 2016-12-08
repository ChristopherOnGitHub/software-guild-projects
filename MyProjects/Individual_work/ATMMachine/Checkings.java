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
public class Checkings extends Account {

    private ConsoleIO console = new ConsoleIO();

    public Checkings(double balance, String name) {
        super(balance, name);
    }

    public Checkings() {
    }
    

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public double withdrawl() {
        double x = console.readDouble("How much to withdraw?", 0, balance + 100);
        balance = balance - x;
        if (0 > balance) {
            console.print("You have gone over your available funds.");
            console.print("A $10 overdraft fee has been charge to your account");
            this.balance = balance - 10;
        }
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
