package Dashboard;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Subodh on 20/12/2021.
 */
@WebServlet(name = "DashboardServlet")
public class DashboardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("text/html");
        PrintWriter printWriter=response.getWriter();
//        String userName =request.getParameter("username");
//        printWriter.print("welcome"+userName);
//        Cookie cookie=request.getCookies();

        Cookie[] cookies=request.getCookies();
        printWriter.println("hey" +cookies[0].getValue());
        printWriter.close();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
