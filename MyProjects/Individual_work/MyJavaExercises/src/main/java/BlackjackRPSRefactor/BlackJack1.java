/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackjackRPSRefactor;


/**
 *
 * @author apprentice
 */
public class BlackJack1 {
    public static void main(String[] args) {
        
        BlackJackRPSMethods BlackjackRPSMethods = new BlackJackRPSMethods();
        
        
        String playAgain;
        
        do{int userCard = BlackjackRPSMethods.randCard();
        int userCard2 = BlackjackRPSMethods.randCard();
        
        int dealerCard = BlackjackRPSMethods.randCard();
        int dealerCard2 = BlackjackRPSMethods.randCard();
        
        int userTotal = userCard + userCard2;
        int dealerTotal = dealerCard + dealerCard2;
        
            System.out.println("Your drew a " +userCard+ " and a " +userCard2);
            System.out.println("You total is " +userTotal);
            System.out.println(" ");
            System.out.println("The dealer has a " +dealerCard+ " and "
                    + "a hidden card on the table.");
            System.out.println("Hit? (y/n)");
            playAgain = BlackjackRPSMethods.userInputString();
            
            while((playAgain.equals("y") || playAgain.equals("Y")) && userTotal<21){
                int userHitCard= BlackjackRPSMethods.randCard();
                userTotal=userTotal + userHitCard;
                System.out.println("You drew a " +userHitCard+ " your total is " +userTotal);
                System.out.println("Hit? (y/n)");
                playAgain = BlackjackRPSMethods.userInputString();
            }
            
            if(userTotal>21){
                System.out.println("You have busted!");
            }
            else{
                System.out.println("The dealer's second card is a " +dealerCard2);

                while(dealerTotal<17){
                    System.out.println("The dealer hits");
                    int userHitCard= BlackjackRPSMethods.randCard();
                    dealerTotal= dealerTotal + userHitCard;
                    System.out.println("The dealer's new total is: " +dealerTotal);
                    System.out.println(" ");
                }
                
                if(dealerTotal>21){
                    System.out.println("THE DEALER BUSTED YOU WIN!");
                }else if(dealerTotal>userTotal){                    
                    System.out.println("The dealer's "+dealerTotal+" beats your "+userTotal);
                }else if(dealerTotal==userTotal){
                    System.out.println("Tie, dealer wins");
                }
            }
            System.out.println(" ");
            System.out.println("PLAY AGAIN?");
            playAgain = BlackjackRPSMethods.userInputString();

        }while(playAgain.equals("y") || playAgain.equals("Y"));  
    }
    
}
