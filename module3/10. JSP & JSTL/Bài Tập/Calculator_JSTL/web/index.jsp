<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
    <h1>Simple Calculator</h1>
    <form action="/simpleCalculator" method="post">
      <table>
        <tr>
          <td>First operand:</td>
          <td><input type="number" name="firstOperand" required></td>
        </tr>
        <tr>
          <td>Operator: </td>
          <td>
            <select name="operator">
              <option value="+">+</option>
              <option value="-">-</option>
              <option value="*">*</option>
              <option value="/">/</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>Second operand: </td>
          <td><input type="number" name="secondOperand" required></td>
        </tr>
        <tr>
          <td colspan="2" align="center"><input type="submit" value="Calculate"></td>
        </tr>
      </table>
    </form>
  </body>
</html>
