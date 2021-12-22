<%--
  Created by IntelliJ IDEA.
  User: Subodh
  Date: 21/12/2021
  Time: 13:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" href="./css/style.css">
  </head>
  <body>
  <form ACTION="/Loginservlet" method="post" name="Loginform">
    <label for="username">USERNAME:</label>
    <input type="text" name="username" placeholder="Enter the your username"><br>
    <label for="password">PASSWORD:</label>
    <input type="password" name="password" placeholder="Enter the your password"><br>
    <input type="submit" value="login" >
  </form>
  </body>
</html>
