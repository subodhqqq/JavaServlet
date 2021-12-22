package Loginpage;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Subodh on 16/12/2021.
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
String name=request.getParameter("username");
String password=request.getParameter("password");
    PrintWriter out=response.getWriter();
    out.println(name);
    out.println(password);
        if(password.equals("JAVA")) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("");
            response.
            requestDispatcher.forward(request, response);
        }
        else{
            out.println("Incorrect Username and password");
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/index.jsp");
            requestDispatcher.include(request,response);

        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
