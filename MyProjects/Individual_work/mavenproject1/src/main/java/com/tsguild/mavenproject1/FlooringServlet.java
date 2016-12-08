/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.mavenproject1;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author apprentice
 */
@Controller
public class FlooringServlet{
    
    @RequestMapping(value="/FlooringIndex", method = RequestMethod.GET)
    public String displayIt(){
        return "FlooringIndex";
    }


    @RequestMapping(value="/calculate", method=RequestMethod.POST)
    public String doThePost(HttpServletRequest request){

        try{
            double width = Double.parseDouble(request.getParameter("width"));
            double length = Double.parseDouble(request.getParameter("length"));
            double costSqFt = Double.parseDouble(request.getParameter("costSqFt"));

            double materialCost = width * length * costSqFt;

            double laborCost = (((width * length) / 20) * 86) + 21.5;

            double totalCost = materialCost + laborCost;

            request.setAttribute("totalCost", totalCost);
            request.setAttribute("materialCost", materialCost);
            request.setAttribute("laborCost", laborCost);

        }catch (NumberFormatException e){
            boolean badInput = true;
            request.setAttribute("badInput", badInput);
        }
        
        
        return "FlooringResponse";
    }

}
