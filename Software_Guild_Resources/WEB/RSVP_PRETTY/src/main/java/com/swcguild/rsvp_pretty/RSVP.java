/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.rsvp_pretty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apprentice
 */
@WebServlet(name = "RSVP", urlPatterns = {"/RSVP", "/"})
public class RSVP extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // This method lives at the same general office building as the form processor (RSVP, & web app root)
        // But in a different office. At the GET office. So only GET requests to /RSVP or / will end up at this method.
        // We don't really want to do anything other than make sure they end up at the right web page
        // Just forward to the rsvp.jsp to display our form
        request.getRequestDispatcher("rsvp.jsp").forward(request, response);

    }

    
    List<String> attendees = new ArrayList<>();
    int numLlamas = 0;
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // This method lives at the same general office building (RSVP, & web app root)
        // But in a different office. At the POST office. So only POSTS will end up here.
        // I'm expecting this from the form...
        String whosComing;
        String ifTheyreComing;
        String llamasBeingBrought;

        // Then I need to GET the information FROM the parameters
        // which should enclose any info set by a form
        // The parameters are stored in a map, which has a key type string
        // and a value type string
        whosComing = request.getParameter("name");
        ifTheyreComing = request.getParameter("RSVP");
        llamasBeingBrought = request.getParameter("llamas");

        // Now even if I sent llamasBeingBrought as an INTEGER in my form
        // it still comes across as a STring Which means, if I want it in a number form
        // I NEED TO TRANSLATE IT (or parse it)
        // But, DONT TRUST USER INPUT - THIS COULD EXPLODE
        // CAUSE YOU DONT KNOW WHO IS ACTUALLY SENDING YOUR PARAMETERS (OR LACK THERE OF)
        // BUT YOU CAN START WITH THE HAPPY PATH... BUT THEN FIX IT
        try {
            int llamasBrought = Integer.parseInt(llamasBeingBrought);
            numLlamas += llamasBrought;
            
            if (whosComing == null || ifTheyreComing == null) {
                request.setAttribute("badInput", true);
                request.setAttribute("msg", "I don't appreciate you trying to game the system.");
            } else if (whosComing.isEmpty()) {
                request.setAttribute("msg", "HEY! You can't RSVP without a name!");
            } else if (ifTheyreComing.isEmpty()) {
                request.setAttribute("msg", "It's not really an RSVP if you don't tell me if you're coming or not.");
            } else if ("fosho".equals(ifTheyreComing)) {
                request.setAttribute("msg", "SO EXCITED YOU CAN COME " + whosComing);
                attendees.add(whosComing);
                request.setAttribute("partyList", attendees);
                request.setAttribute("isComing", true);
            } else if ("nah".equals(ifTheyreComing)) {
                request.setAttribute("msg", "LAME. " + whosComing + ", you're the WORST.");
            }

        } catch (NumberFormatException e) {
                request.setAttribute("badInput", true);
                request.setAttribute("msg", "Use a whole number to tell me how many llamas you are bringing.");
        }

        request.setAttribute("llamas", numLlamas);
        request.getRequestDispatcher("response.jsp").forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
