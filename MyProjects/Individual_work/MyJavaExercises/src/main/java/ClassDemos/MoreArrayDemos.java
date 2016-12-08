/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemos;

import java.util.Arrays;

/**
 *
 * @author apprentice
 */
public class MoreArrayDemos {
    public static void main(String[] args) {
        
        int[] llamaAges;
        llamaAges = new int[10];
        llamaAges[0]=2;
        llamaAges[1]=8;
        llamaAges[2]=3;
        llamaAges[3]=12;
        llamaAges[4]=16;
        llamaAges[5]=11;
        llamaAges[6]=4;
        llamaAges[7]=4;
        llamaAges[8]=5;
        llamaAges[9]=13;
//        llamaAges[10]=15;

        System.out.println("How many llamas' ages am I tracking?");
        System.out.println(llamaAges.length);
        
        int agesSum = 0;
        for (int i = 0; i<llamaAges.length; i++){
            agesSum = agesSum + llamaAges[i];
        }
        System.out.println("Checking math on for loop" +agesSum);
        
        String[] llamaNames = {
          "Boo", "Prism", "Spectra", "Secret", "Floyd", "Samurai", "NoWhite",
            "Dixie", "BeeBop", "Penny"
        };
        
        for( String name : llamaNames){
            System.out.println("Llama : "+name);
        }
        //Effectively
        System.out.println(" ");
        for (int i = 0; i < llamaNames.length; i++){
            String name = llamaNames[i];
            System.out.println("Llama : " +name);
        }
        
        String[][] llamaHerd = {
            {"Boo", "Floyd"},
            {"Felicity", "Angelina", "Penny", "Dixie", "NoWhite", "BeeBop"},
            {"Spectra", "Secret"}    
        };
        
        System.out.println("Number of subherds: " + llamaHerd.length);
        
        System.out.println("Boo lives here: " +llamaHerd[0][0]);
        System.out.println("Floyd lives here: " +llamaHerd[0][1]);
        
        for (int i=0; i < llamaHerd.length; i++){
            String[] subHerd = llamaHerd[i];
            
            for (int j = 0; j < subHerd.length; j++){
                System.out.print("SubHerd # "+i+"    ");
                System.out.print("Member #"+j+"    ");
                System.out.println("Herd Member: " + subHerd[j]);
            }
        }
        
        for( String[] subHerd : llamaHerd){
            for (String llama: subHerd){
                System.out.println(llama);
            }
        }
        String[] rogueHerd = new String[llamaHerd[1].length+1];
        //String[] rogueHerd = new String[6];
        for (int i = 0; i < llamaHerd[1].length; i++){
            rogueHerd[i] = llamaHerd[1][i];
        }
        
        rogueHerd[llamaHerd[1].length] = "Floyd";
                
        System.out.println("Runaway Llamas: " + rogueHerd[0]);
        System.out.println("Runaway Llamas: " + rogueHerd[6]);
        
        String[] rogueHerd2 = Arrays.copyOf(rogueHerd, 3);
        System.out.println("Second rogue herd size: "+ rogueHerd2.length);
        
        int maxAge = -1;
        int minAge = llamaAges[0];
        for (int i = 0; i < llamaAges.length; i++){
            int curAge = llamaAges[i];
            
            if(curAge > maxAge){
                maxAge = curAge;
            }
            
            if(curAge < minAge){
                minAge=curAge;
            }
        }
        
    }   
}
