<%--
  Created by IntelliJ IDEA.
  User: Subodh
  Date: 17/12/2021
  Time: 07:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/LoginServlet" method="post" name="loginform">
    <label for="user name" >USERNAME :</label>
    <input type="text" name="username" placeholder="Enter the user name "> <br>
    <label for="password">PASSWORD :</label>
    <input type="password" name="password" placeholder="enter the your password"><br>
    <input type="submit" value="LOGIN">



  </form>
  </body>
</html>
