/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.GuitarWebApp.guitarDAO;

import guitarDTO.Guitar;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface guitarDAO {

    List<Guitar> getAllProducts();
    
    Guitar addGuitar(Guitar guitar);

    Guitar getSerial(int serial);

    void removeGuitar(int serial);

    void updateGuitar(Guitar guitar);
    
}
