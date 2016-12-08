/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemos;

/**
 *
 * @author apprentice
 */
public class FlowControl {
       public static void main(String[] args) {
        
           System.out.println("true && true : " + (true && true));
           System.out.println("true && false : " + (true && false));
           System.out.println("false && true : " + (false && true));
           System.out.println("false && false : " + (false && false));
           System.out.println("_____________________________");
           System.out.println("true || true : " + (true || true));
           System.out.println("true || false : " + (true || false));
           System.out.println("false || true : " + (false || true));
           System.out.println("false || false : " + (false || false));
           
           boolean likesLlamas = true;
           boolean isGreen = false;
           if(true){
               System.out.println("This will always execute.");
           }else{
               System.out.println("This will never execute.");
           }
           
           if(likesLlamas){
               System.out.println("I like llamas!!!");
           }
           
           if(isGreen){
               System.out.println("This is green!");
           }else{
               System.out.println("This is NOT green!");
           }
           
           if(!isGreen){
               System.out.println("Still not Green!");
           }
           
           boolean isTurkey = true;
           boolean onFire = true;
           
           if(isTurkey && onFire){
               System.out.println("Egads, your bird is AFLAME!");
           }else if(!isTurkey && onFire){
               System.out.println("Don't know what is burning ...");
               System.out.println("But it smells bad.");
           }else if(isTurkey && !onFire){
               System.out.println("Turkey is in prime condition!");
           }else{ //all other conditions
                System.out.println("No idea what's going on...");
           }
           
           System.out.println("So we know the turkey is on fire...");
           System.out.println("But !(isTurkey && onFire) is :"
                   +!(isTurkey && onFire));
    }
    
}
