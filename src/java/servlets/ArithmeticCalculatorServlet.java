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
public class ArithmeticCalculatorServlet extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstVal = request.getParameter("firstVal");
        String secondVal = request.getParameter("secondVal");
        String math = request.getParameter("math");
        
        int firstNum = Integer.parseInt(firstVal);
        int secondNum = Integer.parseInt(secondVal);
        int total = 0;
        if(math.equals("+")){
            total = firstNum + secondNum;
        }
        else if(math.equals("-")){
            total = firstNum - secondNum;
        }
        else if(math.equals("*")){
            total = firstNum * secondNum;
        }
        else if(math.equals("%")){
            total = firstNum % secondNum;
        }
       
        
        request.setAttribute("theValue", total);
    }

   

}
