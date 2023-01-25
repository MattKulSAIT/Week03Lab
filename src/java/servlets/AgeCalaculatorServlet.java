/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mdkul
 */
public class AgeCalaculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String theAge = request.getParameter("theAge");
        try{
            int theAgeI = Integer.parseInt(theAge);
        theAgeI++;
        String message = "Your age next birthday will be "+theAgeI;
         request.setAttribute("theAgeI", message);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
        }catch(NumberFormatException e){
            String error = "";
            if (theAge.equals("")){
                error = "You must enter your current age.";
            }
            else{
                error = "You must enter a number.";
            }
            request.setAttribute("theAgeI", error);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
        }
    }

}
