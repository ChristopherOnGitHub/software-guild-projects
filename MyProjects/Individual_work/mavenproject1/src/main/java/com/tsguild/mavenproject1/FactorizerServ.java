/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.mavenproject1;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FactorizerServ{

    @RequestMapping(value = "/Factorizer", method=RequestMethod.GET)
    public String displayThat(){
        return "Factorizer";
    }


    @RequestMapping(value="/factorize", method=RequestMethod.POST)
            public String doPost(HttpServletRequest request){

        boolean validInput = true;
        ArrayList<Integer> factors = new ArrayList();

        int i = 1;
        int prime = 0;
        int userNumber = -1;
        boolean badInput = false;

        try {
            userNumber = Integer.parseInt(request.getParameter("numToFactorizer"));

            int perfTracker = userNumber;

            while (i < userNumber) {
                if ((userNumber % i) == 0) {
                    prime++;
                    perfTracker = perfTracker - i;
                    factors.add(i);
                }
                i++;
            }

            request.setAttribute("factors", factors);
            request.setAttribute("badInput", badInput);
            request.setAttribute("prime", prime);
            request.setAttribute("perfTracker", perfTracker);

        } catch (NumberFormatException e) {
            badInput = true;
            request.setAttribute("badInput", badInput);
        }

        return "responseFctr";

    }



}
