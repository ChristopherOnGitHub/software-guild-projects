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
    public double withdrawl(double x) {
        balance = balance - x;
        if (0 > balance) {
            System.out.println("You have gone over your available funds.");
            System.out.println("A $10 overdraft fee has been charge to your account");
            this.balance = balance - 10;
        }
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
