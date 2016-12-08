/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.rsvp_actually;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ahill
 */
@WebServlet(name = "RSVP", urlPatterns = {"/TallyInvitation", "/"})
public class RSVP extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RSVP</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RSVP at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        processRequest(request, response);
    }

    ArrayList<String> peopleRSVPd = new ArrayList<>();

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

        String personWhosComing = request.getParameter("name");
        String rsvp = request.getParameter("rsvp");

        String msg = "";

        // Tricksy way of condensing
        // (rsvp != null && rsvp.equals("da"))
        if ("da".equals(rsvp)) {
            if (personWhosComing != null && !personWhosComing.equals("")) {
                msg = "OMG WE ARE SO EXCUTED YOU CAN COME!!!!!!!!!!!! THANK YOU FOR RSVPING " + personWhosComing;
                peopleRSVPd.add(personWhosComing);
            } else{
                msg = "Hey, you can't RSVP if you don't tell me who are.";
            }

        } else if ("nyet".equals(rsvp)) {
            msg = "OMG you CAN'T come?? You owe me BIG! And probably a present too!!";
        } else {
            request.setAttribute("badInput", true);
            msg = "Hey, you didn't RSVP correctly. TRY AGAIN.";
        }

        request.setAttribute("partyList", msg);
        request.setAttribute("msgInABottle", msg);
        // FORWARD THE REQUEST!
//        RequestDispatcher forwarder = request.getRequestDispatcher("response.jsp");
//        forwarder.forward(request, response);

        // You can do this on one line.
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
