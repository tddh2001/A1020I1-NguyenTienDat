<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
  <h1 style="text-align: center">Dictionary</h1>
  <form action="/dictionary" method="get">
    <label>Vietnamese </label>
    <input type="text" name="vietnamese">
    <br>
    <input type="submit" value="Lookup">
  </form>
  <label>${result}</label>
  </body>
</html>
