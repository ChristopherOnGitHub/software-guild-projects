/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/** 
 *
 * @author apprentice
 */
public class StateTaxDAOImpl implements StateTaxDAO {

    private final String FILE_NAME = "stateTaxes.txt";
    private final HashMap<String, Double> taxRateList;
    private final String DELIMITER = ",";

    public StateTaxDAOImpl() {
        taxRateList = new HashMap();
    }

    @Override
    public void loadMaterials() throws IOException {

        Scanner userInput = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

        while (userInput.hasNextLine()) {
            String harambe = userInput.nextLine();

            String[] stateAndTax = harambe.split(DELIMITER);

            if (stateAndTax.length != 2) {
                continue;
            }

            taxRateList.put(stateAndTax[0], Double.parseDouble(stateAndTax[1]));

            if (stateAndTax.length != 2) {
                continue;
            }

            taxRateList.put(stateAndTax[0], Double.parseDouble(stateAndTax[1]));
        }

    }

    @Override
    public HashMap<String, Double> listAll() {
        return taxRateList;
    }

}
