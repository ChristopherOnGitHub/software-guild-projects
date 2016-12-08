/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapp.dto;

import java.util.Calendar;
import java.util.Objects;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author ahill
 */
public class Pet {
    
    
    private int id;
    
    @NotEmpty(message="A pet must have a name!!")
    @Length(min=2, max=50, message="Pet name must between 2 and 50 characters in length.")
    private String name;
    
    @NotEmpty(message="A pet must have a name!!")
    @Length(max=50, message="Pet breed must be no more than 50 characters in length.")
    private String breed;
    
    @NotEmpty(message="A pet must have a name!!")
    @Length(max=250, message="Disposition description must be no more than 250 characters in length.")
    private String disposition;
    
    private boolean vaccinated;
    private Calendar dateAdded;
    
    public Pet (int id, String name, String breed, String disposition, boolean vaccinated){
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.disposition = disposition;
        this.vaccinated = vaccinated;
        dateAdded = Calendar.getInstance();
    }
    
    public Pet(){
        
    }

    public String getDateAsString(){
        return dateAdded.toString();
    }
    
    public void setDateAsString(String dateAsString){
        dateAdded = Calendar.getInstance();
    }
    
    public Calendar getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Calendar dateAdded) {
        this.dateAdded = dateAdded;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.breed);
        hash = 37 * hash + Objects.hashCode(this.disposition);
        hash = 37 * hash + (this.vaccinated ? 1 : 0);
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
        final Pet other = (Pet) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.vaccinated != other.vaccinated) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.breed, other.breed)) {
            return false;
        }
        if (!Objects.equals(this.disposition, other.disposition)) {
            return false;
        }
        return true;
    }
    
    
    
}
