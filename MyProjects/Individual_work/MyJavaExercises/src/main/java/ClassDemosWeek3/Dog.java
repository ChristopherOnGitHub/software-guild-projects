/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemosWeek3;

/**
 *
 * @author apprentice
 */
public class Dog extends Animal implements Huggable{
    private String name;
    
    @Override
    public void hug(){
        System.out.println("Dog has been hugged!!!");
    
    }  
}

