/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author apprentice
 */
public interface StateTaxDAO {

    HashMap<String, Double> listAll();

    void loadMaterials() throws IOException;
    
}
