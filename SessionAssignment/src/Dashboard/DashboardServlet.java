package Dashboard;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Subodh on 22/12/2021.
 */
@WebServlet(name = "DashboardServlet")
public class DashboardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("text/html");
        PrintWriter out=response.getWriter();
       String name=request.getParameter("username");

        HttpSession session=request.getSession(false);
        session.setAttribute("sessionName",name);
        session.setMaxInactiveInterval(10);

        out.println("<a href='/HomeServlet'>Home</a>");
        if(session!=null) {
            out.println("hello" + name);
            String sessions = (String) session.getAttribute("sesionName");


            //System.out.println("Login");
            out.println("<a href='/LogoutServlet'>LOGOUT</a>");



        }
        else{
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/index.jsp");
            requestDispatcher.include(request,response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
