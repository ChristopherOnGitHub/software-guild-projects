/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.GuitarWebApp.guitarDAO;

import guitarDTO.Guitar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class guitarDAOImpl implements guitarDAO {
    
    private Map<Integer, Guitar> guitarMap = new HashMap<>();
    private static int guitarSerial = 0;
    
    @Override
    public Guitar addGuitar(Guitar guitar){
        guitar.setSerial(guitarSerial);
        guitarMap.put(guitarSerial, guitar);
        guitarSerial++;
        return guitar;
    }
    
    @Override
    public Guitar getSerial(int serial){
        return guitarMap.get(serial);
    }
    
    @Override
    public List<Guitar> getAllProducts(){
        return guitarMap.values().stream().collect(Collectors.toList());
    }
    
    @Override
    public void updateGuitar(Guitar guitar){
        guitarMap.put(guitar.getSerial(), guitar);
    }
    
    @Override
    public void removeGuitar(int serial){
        guitarMap.remove(serial);
    }
    
}
