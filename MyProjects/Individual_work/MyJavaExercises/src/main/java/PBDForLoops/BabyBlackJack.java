/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDForLoops;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class BabyBlackJack {
    public static void main(String[] args) {
        Random randGen = new Random();
        
        System.out.println("LET'S PLAY BLACK JACK");
        
        System.out.println("YOUR TWO 'CARDS' ARE:");
        int userCard1=randGen.nextInt(10)+1;
        int userCard2=randGen.nextInt(10)+1;
        System.out.println(userCard1);
        System.out.println(userCard2);
        int userTotal = userCard1+userCard2;
        System.out.println("  ");
        
        System.out.println("THE BOT'S TWO 'CARDS' ARE:");
        int botCard1=randGen.nextInt(10)+1;
        int botCard2=randGen.nextInt(10)+1;
        System.out.println(botCard1);
        System.out.println(botCard2);
        int botTotal = botCard1+botCard2;
        System.out.println("  ");
        
        System.out.println("YOUR TOTAL: "+userTotal+ "  BOT TOTAL: "+botTotal);
        
        if(userTotal>botTotal){
            System.out.println("YOU WIN!");
        }else if(botTotal>userTotal){
            System.out.println("BOT WINS!");
        }else{
            System.out.println("DRAW!");
        }
            
    }
    
}
