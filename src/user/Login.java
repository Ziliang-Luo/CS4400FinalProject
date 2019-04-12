package user;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import java.sql.*;

public class Login extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        if(Validate.checkUser(email, password))
        {
            RequestDispatcher rs = request.getRequestDispatcher("UserRegister.jsp");
            rs.forward(request, response);
        }
        
        else
        {
           out.println("Username or Password incorrect");
           RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
           rs.include(request, response);
        }
    }  
}