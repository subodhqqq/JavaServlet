package Login;

import Dashboard.DashboardServlet;
import sun.rmi.runtime.Log;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Subodh on 17/12/2021.
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
   String name=request.getParameter("username");
   String password=request.getParameter("password");
        PrintWriter out=response.getWriter();
   if(name.equals("Subodh") && password.equals("JAVA"))
   {
      // RequestDispatcher requestDispatcher=request.getRequestDispatcher("/Dashboard.html");
       response.sendRedirect("https://dotnettutorials.net/lesson/facade-design-pattern/");
      // requestDispatcher.include(request,response);
   }
   else {
       out.print("incoreect password and username");
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/index.jsp");
        requestDispatcher.include(request,response);

   }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        String name=request.getParameter("username");
//        String password=request.getParameter("password");
//        PrintWriter out=response.getWriter();
//        if(name.equals("Subodh") && password.equals("JAVA"))
//        {
//            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/Dashboard.html");
//            requestDispatcher.include(request,response);
//        }
//        else {
//            out.print("incoreect password and username");
//            RequestDispatcher requestDispatcher=request.getRequestDispatcher("/index.jsp");
//            requestDispatcher.include(request,response);
//
//        }
//
   }
}
