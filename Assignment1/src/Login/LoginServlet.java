package Login;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Subodh on 21/12/2021.
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
      response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("username");
        String password=request.getParameter("password");

        if(name.equals("Subodh") && password.equals("JAVA"))
        {
            Cookie cookie=new Cookie("uName",name);
            response.addCookie(cookie);
            out.print("Welcome"+name);
;

            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/DashboardServlet");
            requestDispatcher.forward(request,response);
        }
        else {
            out.print("incoreect password and username");
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/index.jsp");
            requestDispatcher.include(request,response);

        }




//        if(password.equals("JAVA") && name.equals("Subodh"))
//        {
//            Cookie cookie=new Cookie("uName",name);
//            //cookie.setMaxAge(2000);
//            response.addCookie(cookie);
//            out.print("Welcome"+name);
//
//            out.println("<form action='/DashboardServlet' method='POST'>");
//            out.println("<input type='submit' value='submit'>");
//            out.print("</form>");
//
//            out.close();
//
//
//        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
