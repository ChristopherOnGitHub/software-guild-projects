/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelter.dto;

/**
 *
 * @author ahill
 */
public class Pet {

    private int id;
    private int age;
    private String name;
    private String condition;
    private String species;

    public Pet() {

    }

    public Pet(int id, String name, String condition, String species, int age) {
        this.id = id;
        this.name = name;
        this.condition = condition;
        this.species = species;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

}
