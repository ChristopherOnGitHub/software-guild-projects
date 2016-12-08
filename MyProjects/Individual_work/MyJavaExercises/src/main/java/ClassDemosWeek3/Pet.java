/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemosWeek3;

public class Pet {
    
    private int id;
    private String name;
    private String condition;
    private String species;
    
    public Pet(){}
    //what the default constructor would look like^^^
    
    public Pet(int id, String name, String condition, String species){
    this.id = id;
    this.name = name;
    this.condition = condition;
    this.species = species;
    }
    
    //getters for properties
    public int getId(){
        return this.id;
    } 
    
    public String getName(){
        return this.name;
    }
    
    public String getCondition(){
        return this.condition;
    }
    
    public String getSpecies(){
        return this.species;
    }
    
    //setters for properties
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setCondition(String condition){
        this.condition = condition;
    }
    
    public void setSpecies(String species){
        this.species = species;
    }
    
}
