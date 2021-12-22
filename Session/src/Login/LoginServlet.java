package Login;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Subodh on 22/12/2021.
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//   response.setContentType("text/html");
//        PrintWriter out=response.getWriter();
//        String name=request.getParameter("username");
//        out.println("welcome "+name);
//
//        HttpSession session=request.getSession();
//        //HttpSession session1=request.getSession(true);
//        session.setAttribute("sessionName",name);
//        out.print("<a href='/DashboardServlet'>GO</a>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("username");
        out.println("welcome "+name);

        HttpSession session=request.getSession();
        //HttpSession session1=request.getSession(true);
        session.setAttribute("sessionName", name);
        out.print("<a href='/DashboardServlet'>GO</a>");
    }
}
