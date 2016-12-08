/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackjackRPSRefactor;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class BlackJackRPSMethods {
    Random randGen = new Random();
    Scanner userInput = new Scanner(System.in);
    
    
    int randCard(){
                int card = randGen.nextInt(10)+2;
                return card;
    }
    
    String userInputString(){
        String yn = userInput.next();
        while(!(yn.equals("y")||yn.equals("Y")||yn.equals("n")||yn.equals("N"))){
            System.out.println("PLEASE ENTER Y = YES OR N = NO");
            yn = userInput.next();
        }
        return yn;
    }
    
    int userNumber(int minNum, int maxNum){
        int x = userInput.nextInt();
        
        while(x>maxNum||x<minNum){
            System.out.println("Please enter a valid selection");
            x = userInput.nextInt();
        }
        return x;
    }
    
    int botChoice(){
        int botChoice = randGen.nextInt(3)+1;
        return botChoice;
    }
    
}
