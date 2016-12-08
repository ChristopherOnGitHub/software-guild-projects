/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseballLeague;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BaseballDAO {

    private final String SAVE_FILE = "BallLeague.txt";
    private final String DELIMITER = "::";
    HashMap<String, ArrayList<String>> LeagueMap = new HashMap<>();
    Set<String> teamName = LeagueMap.keySet();
    ConsoleIO console = new ConsoleIO();

    public int menu() {
        int x;
        System.out.println("***TEAM EDITOR***");
        System.out.println("1. Create a new team");
        System.out.println("2. Register a new player");
        System.out.println("3. List all teams");
        System.out.println("4. List all players on a team");
        System.out.println("5. Trade a player");
        System.out.println("6. Remove a player");
        System.out.println("7. Save and quit");
        x = console.readInt("", 1, 7);
        return x;
    }

    public void createTeam() {

        String x = console.readString("What is the name of the new team?");
        ArrayList<String> y = new ArrayList<>();
        LeagueMap.put(x, y);
        System.out.println(" ");
    }

    public void addPlayer() {
        String x = console.readString("What team are you adding a player to?");
        String y = console.readString("What is the new player's name?");
        LeagueMap.get(x).add(y);
        System.out.println(" ");
    }

    public void listTeams() {
        Set<String> teamName = LeagueMap.keySet();
        for (String x : teamName) {
            System.out.println(x);
        }
        System.out.println(" ");
    }

    public void listPlayer() {
        String x = console.readString("What team to list players of?");
        for (String y : LeagueMap.get(x)) {
            System.out.println(y);
        }
        System.out.println(" ");
    }

    public void tradePlayer() {
        String team1 = console.readString("What team to remove player from?");
        String team2 = console.readString("What team to send player to?");
        System.out.println("Players on team:");
        for (String y : LeagueMap.get(team1)) {
            System.out.println(y);
        }
        String z = console.readString("What player to trade?");
        for (String y : LeagueMap.get(team1)) {
            if (z.equalsIgnoreCase(y)) {
                LeagueMap.get(team2).add(y);
                LeagueMap.get(team1).remove(y);
            }
        }
        System.out.println(" ");

    }

    public void removePlayer() {
        String x = console.readString("What team to remove player from?");
        System.out.println("Players on team:");
        for (String y : LeagueMap.get(x)) {
            System.out.println(y);
        }
        String z = console.readString("What player to remove?");
        for (String y : LeagueMap.get(x)) {
            if (z.equalsIgnoreCase(y)) {
                LeagueMap.remove(y);
            }
        }
        System.out.println(" ");
    }

    public void saveExit() throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(SAVE_FILE));
        Set<String> teamName = LeagueMap.keySet();

        for (String y : teamName) {
            writer.print(y + DELIMITER);
            for (String x : LeagueMap.get(y)) {
                writer.print(x + DELIMITER);
            }
            writer.println();

        }

        writer.flush();
        writer.close();

    }

    public HashMap<String, ArrayList<String>> loadFile() throws FileNotFoundException {
        Scanner scanRead = new Scanner(new BufferedReader(new FileReader(SAVE_FILE)));
        while (scanRead.hasNextLine()) {
            String x = scanRead.nextLine();
            ArrayList<String> y = new ArrayList<>();
            String[] teamInfo = x.split(DELIMITER);
            for (int i = 1; i < teamInfo.length; i++) {
                y.add(teamInfo[i]);
            }
            LeagueMap.put(teamInfo[0], y);
        }
        return LeagueMap;
    }

}
