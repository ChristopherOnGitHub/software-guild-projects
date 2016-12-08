/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.unitconverter;

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
@WebServlet(name = "UnitServlet", urlPatterns = {"/convert"})
public class UnitServlet extends HttpServlet {

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
            out.println("<title>Servlet UnitServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UnitServlet at " + request.getContextPath() + "</h1>");
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
        boolean badInput = false;
        int x;
        int d1;
        int d2;
        int v1;
        int v2;
        int m1;
        int m2;
        double amount;

        
        try{
        x = Integer.parseInt(request.getParameter("measurements"));
        d1 = Integer.parseInt(request.getParameter("dUnit1"));
        d2 = Integer.parseInt(request.getParameter("dUnit2"));
        v1 = Integer.parseInt(request.getParameter("vUnit1"));
        v2 = Integer.parseInt(request.getParameter("vUnit2"));
        m1 = Integer.parseInt(request.getParameter("mUnit1"));
        m2 = Integer.parseInt(request.getParameter("mUnit2"));
        amount = Double.parseDouble(request.getParameter("amount"));

        switch (x) {
            case 1:
                if (d1 == 1) {

                    if (d2 == 2) {
                        amount = amount / 12;
                    } else if (d2 == 3) {
                        amount = amount / 36;
                    } else if (d2 == 4) {
                        amount = amount / 63360;
                    }

                } else if (d1 == 2) {
                    amount = amount * 12;

                    if (d2 == 2) {
                        amount = amount / 12;
                    } else if (d2 == 3) {
                        amount = amount / 36;
                    } else if (d2 == 4) {
                        amount = amount / 63360;
                    }

                } else if (d1 == 3) {
                    amount = amount * 36;

                    if (d2 == 2) {
                        amount = amount / 12;
                    } else if (d2 == 3) {
                        amount = amount / 36;
                    } else if (d2 == 4) {
                        amount = amount / 63360;
                    }

                } else if (d1 == 4) {
                    amount = amount * 63360;

                    if (d2 == 2) {
                        amount = amount / 12;
                    } else if (d2 == 3) {
                        amount = amount / 36;
                    } else if (d2 == 4) {
                        amount = amount / 63360;
                    }

                }

            case 2:
                if (v1 == 1) {

                    if (v2 == 2) {
                        amount = amount / 2;
                    } else if (v2 == 3) {
                        amount = amount / 4;
                    } else if (v2 == 4) {
                        amount = amount / 16;
                    }

                } else if (v1 == 2) {
                    amount = amount * 2;

                    if (v2 == 2) {
                        amount = amount / 2;
                    } else if (v2 == 3) {
                        amount = amount / 4;
                    } else if (v2 == 4) {
                        amount = amount / 16;
                    }

                } else if (v1 == 3) {
                    amount = amount * 4;

                    if (v2 == 2) {
                        amount = amount / 2;
                    } else if (v2 == 3) {
                        amount = amount / 4;
                    } else if (v2 == 4) {
                        amount = amount / 16;
                    }

                } else if (v1 == 4) {
                    amount = amount * 16;

                    if (v2 == 2) {
                        amount = amount / 2;
                    } else if (v2 == 3) {
                        amount = amount / 4;
                    } else if (v2 == 4) {
                        amount = amount / 16;
                    }

                }

            case 3:
                if (m1 == 1) {

                    if (m2 == 2) {
                        amount = amount / 28.35;
                    } else if (m2 == 3) {
                        amount = amount / 454;
                    } else if (m2 == 4) {
                        amount = amount / 907184;
                    }

                } else if (m1 == 2) {
                    amount = amount * 28.35;

                    if (m2 == 2) {
                        amount = amount / 28.35;
                    } else if (m2 == 3) {
                        amount = amount / 454;
                    } else if (m2 == 4) {
                        amount = amount / 907184;
                    }

                } else if (m1 == 3) {
                    amount = amount * 454;

                    if (m2 == 2) {
                        amount = amount / 28.35;
                    } else if (m2 == 3) {
                        amount = amount / 454;
                    } else if (m2 == 4) {
                        amount = amount / 907184;
                    }

                } else if (m1 == 4) {
                    amount = amount * 907184;

                    if (m2 == 2) {
                        amount = amount / 28.35;
                    } else if (m2 == 3) {
                        amount = amount / 454;
                    } else if (m2 == 4) {
                        amount = amount / 907184;
                    }

                }
        }

        request.setAttribute("amount", amount);

        }catch(NumberFormatException nfe){
            badInput = true;
            request.setAttribute("badInput", badInput);
        }
        
        RequestDispatcher forwarder = request.getRequestDispatcher("UnitConverterResponse.jsp");

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
