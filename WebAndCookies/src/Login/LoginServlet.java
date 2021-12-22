package Login;

import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Subodh on 20/12/2021.
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("username");

        Cookie cookie=new Cookie("uName",name);
        cookie.setMaxAge(2000);
        response.addCookie(cookie);
        out.print("Welcome"+name);

        out.println("<form action='/DashboardServlet' method='POST'>");
        out.println("<input type='submit' value='submit'>");
        out.print("</form>");

        out.close();


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
