<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculation</h1>
<form action="/calculator" method="get">
    <input type="number" name="num1" placeholder="Number 1">
    <input type="number" name="num2" placeholder="Number 2"><br><br>
    <button type="submit" name="operator" value="+" class="btn btn-primary">Addition +</button>
    <button type="submit" name="operator" value="-" class="btn btn-primary">Subtraction -</button>
    <button type="submit" name="operator" value="*" class="btn btn-primary">Multiplication *</button>
    <button type="submit" name="operator" value="/" class="btn btn-primary">Division /</button>
</form>
<span>Result: ${result}</span>
</body>
</html>
