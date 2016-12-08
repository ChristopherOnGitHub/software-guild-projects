/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATMMachine;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class ATMDao {

    List<Account> accounts;

    public List<Account> accountData() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Savings(1000.00, "Emergency Saving"));
        accounts.add(new Checkings(243.10, "Personal Checking"));
        accounts.add(new Savings(27020.34, "Retirement"));
        return accounts;
    }

}
