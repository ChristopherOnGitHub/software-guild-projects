/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import DAO.ConfigDAO;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author apprentice
 */
public interface ConsoleIO extends ConfigDAO {

    @Override
    int config() throws FileNotFoundException;

    @Override
    String configTest() throws FileNotFoundException;

    @Override
    void updateOrderNumber(int orderNumber, String x) throws IOException;
    
}