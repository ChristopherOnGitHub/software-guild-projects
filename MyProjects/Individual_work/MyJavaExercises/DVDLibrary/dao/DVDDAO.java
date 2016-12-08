/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdlibrary.dao;

import com.tsguild.dvdlibrary.dto.Movie;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DVDDAO {

    private final String FILE_NAME;
    private HashMap<String, Movie> movieMap;
    private final String DELIMITER = "::";

    public DVDDAO() {
        FILE_NAME = "Movie_Database.txt";
        movieMap = new HashMap<>();

    }

    public void addAMovie(Movie newMovie) {
        movieMap.put(newMovie.getTitle(), newMovie);
    }

    public Collection<Movie> listAll() {
        return movieMap.values();
    }
    

    public Movie removeMovie(String title) {
        return movieMap.remove(title);
    }

    public void loadMovies() throws IOException {
        try {
            Scanner userInput = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

            while (userInput.hasNextLine()) {
                String temp = userInput.nextLine();
                String[] movieVariables = temp.split(DELIMITER);

                if (movieVariables.length != 6) {
                    continue;
                }

                Movie newMovie = new Movie();

                newMovie.setTitle(movieVariables[0]);
                newMovie.setReleaseDate(movieVariables[1]);
                newMovie.setRating(movieVariables[2]);
                newMovie.setDirector(movieVariables[3]);
                newMovie.setStudio(movieVariables[4]);
                newMovie.setUserRating(movieVariables[5]);

                movieMap.put(newMovie.getTitle(), newMovie);

            }
        } catch (FileNotFoundException e) {
            new FileWriter(FILE_NAME);
        }
    }
    
    public void saveExit() throws IOException{
        
        PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));
        
        for(Movie x : movieMap.values()){
            writer.println(x.getTitle()+DELIMITER
            + x.getReleaseDate()+DELIMITER
            + x.getRating()+DELIMITER
            + x.getDirector()+DELIMITER
            + x.getStudio()+DELIMITER
            + x.getUserRating()+DELIMITER);
        }
        
        writer.flush();
        writer.close();
    }

}
