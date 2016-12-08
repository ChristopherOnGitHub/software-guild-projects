/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseballLeague;

import java.io.IOException;

/**
 *
 * @author apprentice
 */
public class BaseballController {

public void run() throws IOException{

        BaseballDAO dao = new BaseballDAO();

        boolean keepRunning = true;
        
        dao.loadFile();

        do {

            switch (dao.menu()) {

                case 1:
                    dao.createTeam();
                    break;
                case 2:
                    dao.addPlayer();
                    break;
                case 3:
                    dao.listTeams();
                    break;
                case 4:
                    dao.listPlayer();
                    break;
                case 5:
                    dao.tradePlayer();
                    break;
                case 6:
                    dao.removePlayer();
                    break;
                case 7:
                    dao.saveExit();
                    keepRunning = false;
                    break;
                default:
                    System.out.println("CATASTROPHIC ERROR!");

            }
        } while (keepRunning);

    }

}
