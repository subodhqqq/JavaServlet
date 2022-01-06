package Login;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Subodh on 22/12/2021.
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String name =request.getParameter("username");
        String password =request.getParameter("password");

        if(password.equals("JAVA") && name.equals("Subodh"))
        {
            HttpSession session=request.getSession();
            session.setAttribute("sessionName",name);
            out.println("welcome "+name);
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/DashboardServlet");
            requestDispatcher.forward(request,response);
        }
        else{
            out.println("username and password is invlid:");
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/index.jsp");
            requestDispatcher.include(request,response);
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
