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
abstract public class Account {

    protected double balance;
    protected String name;

    protected Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public Account() {

    }

    abstract public double withdrawl();

    abstract public double deposit();

    abstract public double checkBalance();

}
