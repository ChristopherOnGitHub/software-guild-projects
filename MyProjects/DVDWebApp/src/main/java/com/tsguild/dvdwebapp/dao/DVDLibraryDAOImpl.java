/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdwebapp.dao;

import com.tsguild.dvdwebapp.dto.DVD;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class DVDLibraryDAOImpl implements DVDLibraryDAO {
    
    private Map<Integer, DVD> DVDMap = new HashMap<>();
    private static int entryCounter = 0;

    @Override
    public DVD addDVD(DVD movie) {
        movie.setEntryNumber(entryCounter);
        DVDMap.put(entryCounter, movie);
        entryCounter++;
        return movie;

    }

    @Override
    public DVD getDVDByEntryNumber(int movieNumber) {
        return DVDMap.get(movieNumber);
    }

    @Override
    public List<DVD> getAllMovies() {
        return DVDMap.values().stream().collect(Collectors.toList());
    }

    @Override
    public void updateMovie(DVD movie) {
        DVDMap.put(movie.getEntryNumber(), movie);
    }

    @Override
    public void removeMovie(int movieEntry) {
        DVDMap.remove(movieEntry);
    }

//    public List<DVD> searchMovies(Map<SearchTerm, String> criteria) {
//        throw new UnsupportedOperationException("Not supported yet.");
//        
//    }

    @Override
    public List<DVD> searchMovies(Predicate<DVD> filter) {
        return DVDMap.values().stream()
                .filter(filter).collect(Collectors.toList());
    }
    
}
