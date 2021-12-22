package Dashboard;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Subodh on 21/12/2021.
 */
public class dashboardServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        String name=request.getParameter("name");
        out.print("welcome"+name);
    }
}
