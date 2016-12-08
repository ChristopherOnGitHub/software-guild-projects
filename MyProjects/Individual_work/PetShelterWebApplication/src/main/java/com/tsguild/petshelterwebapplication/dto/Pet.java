/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapplication.dto;

import java.util.Objects;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author apprentice
 */
public class Pet {

    
    private int id;
    @NotEmpty(message="A pet must have a name!")
    @Length(min=2, max=50, message="Name cannot be longer than 50 chars or less than 2")
    private String name;
    @NotEmpty(message="A pet must have a breed!")
    @Length(max=50, message="Breed cannot be longer than 50 chars")
    private String breed;
    @NotEmpty(message="A pet must have a disposition!")
    @Length(max=50, message="Disposition cannot be longer than 50 chars")
    private String disposition;
    private boolean vacinated;

    public Pet(){}
    
    public Pet(int ID, String name, String breed, String disposition, boolean vacinated){
        this.id = ID;
        this.name = name;
        this.breed = breed;
        this.disposition = disposition;
        this.vacinated = vacinated;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getDisposition() {
        return disposition;
    }

    public boolean isVacinated() {
        return vacinated;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public void setVacinated(boolean vacinated) {
        this.vacinated = vacinated;
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
        if (this.vacinated != other.vacinated) {
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
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.breed);
        hash = 89 * hash + Objects.hashCode(this.disposition);
        hash = 89 * hash + (this.vacinated ? 1 : 0);
        return hash;
    }
    

    
}
