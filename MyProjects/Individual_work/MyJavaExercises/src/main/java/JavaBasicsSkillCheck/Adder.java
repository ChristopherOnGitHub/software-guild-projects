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
public class Adder {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        System.out.println(a +"+"+b+"="+adder(a, b));
        
        a=2;
        b=3;
        System.out.println(a +"+"+b+"="+adder(a, b));
        a=5;
        b=8;
        System.out.println(a +"+"+b+"="+adder(a, b));
        a=95;
        b=42;
        System.out.println(a +"+"+b+"="+adder(a, b));
                
        
        
    }
    
    public static int adder(int a,int b){
       int c;
       c = a + b;
       return c;
       
    }
    
}
