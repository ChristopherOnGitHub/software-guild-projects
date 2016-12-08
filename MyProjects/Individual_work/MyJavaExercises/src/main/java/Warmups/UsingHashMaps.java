package Warmups;

import java.util.HashMap;
import java.util.Set;


public class UsingHashMaps {
    public static void main(String[] args) {
        
        HashMap <String, Integer> playerScores = new HashMap<>(); 
        
        playerScores.put("Smith", 23);
        playerScores.put("Jones", 12);
        playerScores.put("Jordan", 45);
        playerScores.put("Pippen", 32);
        playerScores.put("Kerr", 15);
        
        Set <String> playerName = playerScores.keySet();
        
        for (String x : playerName) {
            System.out.print(x);
            System.out.print(": "+playerScores.get(x));
            System.out.println(" ");
        }
        
        System.out.println(" ");
        
        int total = playerScores.get("Smith")
                +playerScores.get("Jones")
                +playerScores.get("Jordan")
                +playerScores.get("Pippen")
                +playerScores.get("Kerr")
                ;
        
        double avg = total/5;
        
        System.out.println("Team's average: "+avg);
        
        
    }
    
}
