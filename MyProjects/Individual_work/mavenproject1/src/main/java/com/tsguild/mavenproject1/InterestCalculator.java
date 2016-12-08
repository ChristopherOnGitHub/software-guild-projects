/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.mavenproject1;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author apprentice
 */
@Controller
public class InterestCalculator {

    @RequestMapping(value = "/interestIndex", method = RequestMethod.GET)
    public String displayForm() {
        return "interestIndex";
    }

    @RequestMapping(value="/InterestCalculator", method=RequestMethod.POST)
    public String doPost(HttpServletRequest request) {

        double interestRate;
        int timePeriod;
        int yearsUntilClose;
        int currentYear = 2016;
        double beginYearPrinciple;
        double periodRate = 0;
        double preLoopPrinciple = 0;
        double interestEarnedThisYear = 0;
        double initialPrinciple;

        boolean badInput = false;

        try {
            beginYearPrinciple = Double.parseDouble(request.getParameter("beginYearPrinciple"));

            yearsUntilClose = Integer.parseInt(request.getParameter("yearsUntilClose"));

            timePeriod = Integer.parseInt(request.getParameter("timePeriod"));

            interestRate = Double.parseDouble(request.getParameter("interestRate"));

            initialPrinciple = beginYearPrinciple;

            switch (timePeriod) {
                case 1:
                    periodRate = 1 + (interestRate / 100);
                    break;
                case 2:
                    periodRate = 1 + ((interestRate / 4) / 100);
                    break;
                case 3:
                    periodRate = 1 + ((interestRate / 12) / 100);
                    break;
                case 4:
                    periodRate = 1 + ((interestRate / 365) / 100);
                    break;
            }

            while (yearsUntilClose > 0) {

                currentYear++;

                yearsUntilClose--;

                preLoopPrinciple = beginYearPrinciple;

                for (int i = timePeriod; i > 0; i--) {
                    beginYearPrinciple = (beginYearPrinciple * periodRate);
                }

                interestEarnedThisYear = (beginYearPrinciple - preLoopPrinciple);
                System.out.println("You started the year with: $" + preLoopPrinciple);
                System.out.println("You ended the year with: $" + beginYearPrinciple);
                System.out.println("You earned: $" + interestEarnedThisYear + " in interest this year.");

            }

            double totalEarned = (beginYearPrinciple - initialPrinciple);

            request.setAttribute("currentYear", currentYear);
            request.setAttribute("beginYearPrinciple", beginYearPrinciple);
            request.setAttribute("totalEarned", totalEarned);
            request.setAttribute("interestEarnedThisYear", interestEarnedThisYear);
            request.setAttribute("initialPrinciple", initialPrinciple);
            request.setAttribute("badInput", badInput);
        } catch (NumberFormatException e) {
            badInput = true;
            request.setAttribute("badInput", badInput);
        }

        return "responseInterest";
    }

}
