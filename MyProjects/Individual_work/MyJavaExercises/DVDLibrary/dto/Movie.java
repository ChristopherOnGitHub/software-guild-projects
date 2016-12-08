/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdlibrary.dto;

/**
 *
 * @author apprentice
 */
public class Movie {

    private String title;
    private String releaseDate;
    private String rating;
    private String director;
    private String studio;
    private String userRating;
            
    public Movie(){}

    public Movie(String title, String releaseDate, String rating, String director, String studio, String userRating) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.director = director;
        this.studio = studio;
        this.userRating = userRating;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getRating() {
        return rating;
    }

    public String getDirector() {
        return director;
    }

    public String getStudio() {
        return studio;
    }

    public String getUserRating() {
        return userRating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }
    
    
    
    
}
