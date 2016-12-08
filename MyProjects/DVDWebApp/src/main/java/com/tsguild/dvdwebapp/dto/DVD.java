/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdwebapp.dto;

import java.util.Objects;

/**
 *
 * @author apprentice
 */
public class DVD {
    
    private int entryNumber;
    private String title;
    private int releaseDate;
    private String rating;
    private String director;
    private String studio;
    private String userRating;
    
    public DVD () {}

    public DVD(int entryNumber, String title, int releaseDate, String rating, String director, String studio, String userRating) {
        this.entryNumber = entryNumber;
        this.title = title;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.director = director;
        this.studio = studio;
        this.userRating = userRating;
    }

    public int getEntryNumber() {
        return entryNumber;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseDate() {
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

    public void setEntryNumber(int entryNumber) {
        this.entryNumber = entryNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(int releaseDate) {
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.entryNumber;
        hash = 97 * hash + Objects.hashCode(this.title);
        hash = 97 * hash + this.releaseDate;
        hash = 97 * hash + Objects.hashCode(this.rating);
        hash = 97 * hash + Objects.hashCode(this.director);
        hash = 97 * hash + Objects.hashCode(this.studio);
        hash = 97 * hash + Objects.hashCode(this.userRating);
        return hash;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DVD other = (DVD) obj;
        if (this.entryNumber != other.entryNumber) {
            return false;
        }
        if (this.releaseDate != other.releaseDate) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        if (!Objects.equals(this.studio, other.studio)) {
            return false;
        }
        if (!Objects.equals(this.userRating, other.userRating)) {
            return false;
        }
        return true;
    }
    
}
