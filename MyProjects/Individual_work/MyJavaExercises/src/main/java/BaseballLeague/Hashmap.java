/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseballLeague;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
class Hashmap<String, PlayerAL> {
    private String teamName;
    private ArrayList<String> PlayerAL;

    public Hashmap(String teamName, ArrayList<String> PlayerAL) {
        this.teamName = teamName;
        this.PlayerAL = PlayerAL;
        
    }
    private static final Logger LOG = Logger.getLogger(Hashmap.class.getName());

    public String getTeamName() {
        return teamName;
    }

    public ArrayList<String> getPlayerAL() {
        return PlayerAL;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setPlayerAL(ArrayList<String> PlayerAL) {
        this.PlayerAL = PlayerAL;
    }
    
}
