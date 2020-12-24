/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author samul
 */
@WebServlet("/Converter")
public class Converter extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int value = Integer.parseInt(request.getParameter("num"));
        int result;
        String type;
        
        if("0".equals(request.getParameter("conversionType"))){
            result = ((value * 9) / 5) + 32;
            type = "F";
        }
            
        else{
            result = ((value - 32) * 5) / 9;
            type = "C";
        }
            
            
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Conversion Results</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>The result is " + result + type + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
