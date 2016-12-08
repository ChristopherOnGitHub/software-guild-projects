/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdwebapp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.tsguild.dvdwebapp.dto.DVD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apprentice
 */
public class DVDLibraryDaojdbcImpl implements DVDLibraryDAO {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //add a DVD to 
    private static final String SQL_ADD_DVD
            = "INSERT INTO movies (title, releaseDate, rating, director, studio, userRating) "
            + " VALUES(?, ?, ?, ?, ?, ?)";

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly=false)
    public DVD addDVD(DVD movie) {
        jdbcTemplate.update(SQL_ADD_DVD,
                movie.getTitle(),
                movie.getReleaseDate(),
                movie.getRating(),
                movie.getDirector(),
                movie.getStudio(),
                movie.getUserRating()
        );
        int entryNumber = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        movie.setEntryNumber(entryNumber);
        return movie;
    }
    
    // get all movies

    private static final String SQL_SELECT_ALL_DVDS
            = " SELECT * FROM movies ";

    @Override
    public List<DVD> getAllMovies() {
        List<DVD> allMovies;
        allMovies = jdbcTemplate.query(SQL_SELECT_ALL_DVDS, new DVDMapper());
        return allMovies;
    }
    
    // get by entry number

    private static final String SQL_SELECT_BY_ENTRY =
            " SELECT * FROM movies WHERE entryNumber = ? ";
    
    @Override
    public DVD getDVDByEntryNumber(int movieNumber) {
        try{
            return jdbcTemplate.queryForObject(SQL_SELECT_BY_ENTRY, new DVDMapper(), movieNumber);
        } catch (EmptyResultDataAccessException e){
            return null;
        }
    }
    
    // remove an entry

    private static final String SQL_REMOVE_DVD_BY_ENTRY = "DELETE FROM movies WHERE entryNumber = ?";
    
    @Override
    public void removeMovie(int movieEntry) {
        jdbcTemplate.update(SQL_REMOVE_DVD_BY_ENTRY, movieEntry);
    }
    
    //search

    @Override
    public List<DVD> searchMovies(Predicate<DVD> filter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //update dvd
    
    private static final String SQL_UPDATE_DVD = "UPDATE movies SET title = ?, "
            + " releaseDate = ?, "
            + " rating = ?, "
            + " director = ?, "
            + " studio = ?, "
            + " userRating = ? WHERE entryNumber = ?";
    
    @Override
    public void updateMovie(DVD movie) {
        jdbcTemplate.update(SQL_UPDATE_DVD,
        movie.getTitle(),
        movie.getReleaseDate(),
        movie.getRating(),
        movie.getDirector(),
        movie.getStudio(),
        movie.getUserRating(),
        movie.getEntryNumber());
    }

    private static final class DVDMapper implements RowMapper<DVD> {

        @Override
        public DVD 
        mapRow(ResultSet rs, int rowNum) 
                throws SQLException{
                DVD mappedDVD = new DVD();
            Integer entryNumber = rs.getInt("entryNumber");
            String title = rs.getString("title");
            Integer releaseDate = rs.getInt("releaseDate");
            String rating = rs.getString("rating");
            String director = rs.getString("director");
            String studio = rs.getString("studio");
            String userRating = rs.getString("userRating");
            
            mappedDVD.setEntryNumber(entryNumber);
            mappedDVD.setTitle(title);
            mappedDVD.setReleaseDate(releaseDate);
            mappedDVD.setRating(rating);
            mappedDVD.setDirector(director);
            mappedDVD.setStudio(studio);
            mappedDVD.setUserRating(userRating);
            
            return mappedDVD;
        }

    }
}
