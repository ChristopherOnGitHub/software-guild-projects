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
public class Counter {
    public static void main(String[] args) {
        int n;
        n=3;
        for(int i=0;i<=n;i++){
            toN(i);
        }
        n=8;
        for(int i=0;i<=n;i++){
            toN(i);
        }
        n=200;
        for(int i=0;i<=200;i++){
            toN(i);
        }
        
        
        
    }
    
    public static void toN(int i){
        System.out.println(i);
    }
    
}
