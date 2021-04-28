<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <div>
    <h1>Product Discount Calculator</h1>
    <form action="/discountCalculator" method="post">
      <p>Product Description</p>
      <input type="text" name="productDescription">
      <p>List Price</p>
      <input type="text" name="price">
      <p>Discount Percent</p>
      <input type="text" name="discount">
      <br>
      <input type="submit" value="Calculate Discount">
    </form>
  </div>
  </body>
</html>
