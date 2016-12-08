/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasicsSkillCheck;

/**
 *
 * @author apprentice
 */
public class AreTheyTrue {
    public static void main(String[] args) {
        
        boolean a=true;
        boolean b=true;
        System.out.println(howTrue(a, b));
        
        a=false;
        b=false;
        System.out.println(howTrue(a, b));
        
        a=true;
        b=false;
        System.out.println(howTrue(a, b));
        
        a=false;
        b=true;
        System.out.println(howTrue(a, b));
    }
    
    public static String howTrue(boolean a, boolean b){
       String status;
        
        if(a&&b){
            status="BOTH";
        }else if(a||b){
            status="ONLY ONE"; 
        }else{
            status="NEITHER";   
        }
        return status;
    }
    
}
