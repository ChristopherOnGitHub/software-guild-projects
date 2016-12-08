/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdwebapp.dao;

import com.tsguild.dvdwebapp.dto.DVD;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author apprentice
 */
public interface DVDLibraryDAO {

    DVD addDVD(DVD movie);

    List<DVD> getAllMovies();

    DVD getDVDByEntryNumber(int movieNumber);

    void removeMovie(int movieEntry);

    //    public List<DVD> searchMovies(Map<SearchTerm, String> criteria) {
    //        throw new UnsupportedOperationException("Not supported yet.");
    //
    //    }
    
    List<DVD> searchMovies(Predicate<DVD> filter);

    void updateMovie(DVD movie);
    
}
