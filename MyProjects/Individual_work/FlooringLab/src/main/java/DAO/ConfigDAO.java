/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author apprentice
 */
public interface ConfigDAO {

    int config() throws FileNotFoundException;

    String configTest() throws FileNotFoundException;

    void updateOrderNumber(int orderNumber, String x) throws IOException;
    
}
