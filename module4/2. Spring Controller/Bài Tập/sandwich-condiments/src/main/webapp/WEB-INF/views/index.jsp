<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/sandwich" method="post">
    <input type="checkbox" name="sandwich" id="sandwich1" value="Lettuce">
    <label for="sandwich1">Lettuce</label>
    <input type="checkbox" name="sandwich" id="sandwich2" value="Tomato">
    <label for="sandwich2">Tomato</label>
    <input type="checkbox" name="sandwich" id="sandwich3" value="Mustard">
    <label for="sandwich3">Mustard</label>
    <input type="checkbox" name="sandwich" id="sandwich4" value="Sprouts">
    <label for="sandwich4">Sprouts</label>
    <br>
    <input type="submit" value="Submit">
</form>
<h1>List condiments choose:</h1>
${list}
</body>
</html>
