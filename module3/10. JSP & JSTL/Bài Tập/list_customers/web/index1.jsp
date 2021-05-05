<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
  <head>
    <title>List Customers</title>
  </head>
  <body>
  <h1 style="text-align: center">Danh sách khách hàng</h1>

  <table border="1">
    <tr>
      <td>Tên</td>
      <td>Ngày sinh</td>
      <td>Địa chỉ</td>
      <td>Ảnh</td>
    </tr>
    <c:forEach var="customer" items="${customerListServlet}">
      <tr>
        <td><c:out value="${customer.name}"/></td>
        <td><c:out value="${customer.dateOfBirth}"/></td>
        <td><c:out value="${customer.address}"/></td>
        <td>
          <img style="width: 100px" src="${pageContext.request.contextPath}${customer.img}"/>
        </td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
