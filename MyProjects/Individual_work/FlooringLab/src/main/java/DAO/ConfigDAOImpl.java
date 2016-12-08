/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ui.ConsoleIO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ConfigDAOImpl implements ConsoleIO {

    private final String FILE_NAME = "config.txt";
    private final String DELIMITER = ",";

    @Override
    public int config() throws FileNotFoundException {
        Scanner fileReader = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

        String asdf = fileReader.nextLine();
        String[] loaded = asdf.split(DELIMITER);
        int currentID = Integer.parseInt(loaded[0]);
        return currentID;

    } 

    @Override
    public String configTest() throws FileNotFoundException {
        Scanner fileReader = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

        String asdf = fileReader.nextLine();
        String[] loaded = asdf.split(DELIMITER);
        int currentID = Integer.parseInt(loaded[0]);
        String testConfig = loaded[1];
        return testConfig;

    }

    @Override
    public void updateOrderNumber(int orderNumber, String x) throws IOException {

        PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));

        writer.println(orderNumber + DELIMITER + x);

        writer.flush();
        writer.close();

    }
}
