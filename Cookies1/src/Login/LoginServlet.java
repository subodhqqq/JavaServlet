package Login;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Subodh on 21/12/2021.
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("username");
        out.print("welcome to my login"+name);

       // out.println("<input type='submit' value='submit'>GO</a>");
        out.print("<a href='DashboardServlet?name="+name+"'>go</a>");

        out.close();

    }
}
