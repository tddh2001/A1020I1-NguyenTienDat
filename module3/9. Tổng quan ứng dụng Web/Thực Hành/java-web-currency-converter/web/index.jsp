<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Currency Converter</h2>

  <form action="/convert" method="post">
    <p>Rate:</p>
    <input type="text" name="rate" value="22000">
    <p>USD:</p>
    <input type="text" name="usd" value="0">
    <br>
    <input type="submit" id="submit" value="Converter">
  </form>
  </body>
</html>
