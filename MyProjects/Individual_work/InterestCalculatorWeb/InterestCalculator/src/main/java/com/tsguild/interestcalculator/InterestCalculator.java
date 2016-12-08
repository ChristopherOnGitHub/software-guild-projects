/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.interestcalculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apprentice
 */
@WebServlet(name = "Just, DO IT!!!", urlPatterns = {"/InterestCalculator"})
public class InterestCalculator extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
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
            out.println("<title>Servlet InterestCalculator</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InterestCalculator at " + request.getContextPath() + "</h1>");
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
        
        double interestRate;
        int timePeriod;
        int yearsUntilClose;
        int currentYear = 2016;
        double beginYearPrinciple;
        double endYearPrinciple;
        double periodRate = 0;
        double preLoopPrinciple = 0;
        double interestEarnedThisYear = 0;
        double initialPrinciple;

        boolean badInput = false;

        try{
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
        }catch(NumberFormatException e){
            badInput = true;
            request.setAttribute("badInput", badInput);
        }
        
        RequestDispatcher forwarder = request.getRequestDispatcher("responseInterest.jsp");
        forwarder.forward(request, response);
        
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
