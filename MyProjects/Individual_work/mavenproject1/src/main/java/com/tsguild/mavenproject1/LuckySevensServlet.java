package com.tsguild.mavenproject1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author apprentice
 */
//@WebServlet(name = "PLAY!", urlPatterns = {"/jsp/LuckySevensServlet"})
//public class LuckySevensServlet extends HttpServlet {
@Controller
public class LuckySevensServlet {

    @RequestMapping(value = "/L7Index", method = RequestMethod.GET)
    public String displayIt() {
        return "L7Index";
    }

    @RequestMapping(value = "/LuckySevensServlet", method = RequestMethod.POST)
    public String doPost(HttpServletRequest request) {

        Random randGen = new Random();

        double maxWin = 0;
        int maxWinRoll = 0;
        int rolls = 0;
        boolean badInput = false;

        try {
            double beginningBet = Double.parseDouble(request.getParameter("startingBet"));

            double startingBet = beginningBet;

            while (startingBet > 0) {
                int die1 = randGen.nextInt((6) + 1);
                int die2 = randGen.nextInt((6) + 1);
                int dieTotal = (die1 + die2);

                if (dieTotal != 7) {
                    startingBet = startingBet - 1;
                    rolls++;
                } else if (dieTotal == 7) {
                    startingBet = startingBet + 4;
                    rolls++;
                    if (startingBet > maxWin) {
                        maxWin = startingBet;
                        maxWinRoll = rolls;
                    }
                }
            }

            if (beginningBet <= 0) {
                badInput = true;
            }

            request.setAttribute("beginningBet", beginningBet);
            request.setAttribute("maxWin", maxWin);
            request.setAttribute("maxWinRoll", maxWinRoll);
            request.setAttribute("rolls", rolls);
            request.setAttribute("badInput", badInput);

        } catch (NumberFormatException e) {
            badInput = true;
            request.setAttribute("badInput", badInput);
        }
        
        return "responseL7";
    }

}
