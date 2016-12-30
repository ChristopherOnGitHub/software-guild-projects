/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
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
@WebServlet(name = "PLAY!", urlPatterns = {"/LuckySevensServlet"})
public class LuckySevensServlet extends HttpServlet {

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
            out.println("<title>Servlet LuckySevensSerlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LuckySevensSerlet at " + request.getContextPath() + "</h1>");
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
            
            if(beginningBet <= 0){
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
        RequestDispatcher forwarder = request.getRequestDispatcher("responseL7.jsp");
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
