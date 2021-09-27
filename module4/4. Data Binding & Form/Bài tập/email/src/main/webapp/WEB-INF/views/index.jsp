<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Email</title>
</head>
<body>
<form:form modelAttribute="email" action="/send" method="post">
  <table>
    <tr>
      <td>Language</td>
      <td><form:select path="languages" items="${languages}"/></td>
      <br>
    </tr>
    <tr>
      <td>Page size</td>
      <td>Show <form:select path="pageSize" items="${pageList}"/> emails per page</td>
    </tr>
    <tr>
      <td>Spams filter</td>
      <td><form:checkbox path="spamFilters"/> Enable spams filter</td>
    </tr>
    <tr>
      <td>Signature</td>
      <td><form:textarea path="signature"/></td>
    </tr>
  </table>
  <button type="submit">Update</button>
  <a href="/showEmail">Show</a>
</form:form>
</body>
</html>