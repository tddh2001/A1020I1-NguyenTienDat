<%--
  Created by IntelliJ IDEA.
  User: phanviet
  Date: 9/13/2021
  Time: 5:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Convert USD To VND</h1>
  <form action="/convert" method="get">
    <label>Input money</label>
    <input type="text" name="money">
    <br>
    <input type="submit" value="Convert">
  </form>
  <label>Result: ${result}</label>
  </body>
</html>
