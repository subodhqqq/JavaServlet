<%--
  Created by IntelliJ IDEA.
  User: Subodh
  Date: 16/12/2021
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/LogInServlet" method="post" name="loginform">
    <label for="username">UserName</label>
    <input type="text" name="username" placeholder="enter the your user name"> <br>
    <label for="password">Password</label>
    <input type="password" name="password" placeholder="Enter the your password"> <br>
    <input type="submit"  value="LOGIN">

  </form>
  </body>
</html>
