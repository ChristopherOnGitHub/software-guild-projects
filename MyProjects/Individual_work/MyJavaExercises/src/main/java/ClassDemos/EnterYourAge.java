
package ClassDemos;

import java.util.Scanner;

public class EnterYourAge {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What is your age?");
        int age = userInput.nextInt();
        
        while((age<=0)||(age>200)){
            System.out.println("Don't lie to me...");
            age = userInput.nextInt();
        }
        
        if(age<18){
            System.out.println("You must be in school");
        }else if((age>18)&&(age<65)){
            System.out.println("Time to go to work");
        }else if(age>65){
            System.out.println("Enjoy your retirement!");
        }
        
    }
    
}
