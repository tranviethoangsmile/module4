<%--
  Created by IntelliJ IDEA.
  User: tvh-macbookpro
  Date: 07/10/2021
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="/calculator" method="post">
      <input type="number" name="firstNum">
      <input type="number" name="lastNum"> <br>

        <button type="submit" value="add" name="action">Addition (+)</button>


        <button type="submit" value="sub" name="action">Addition (-)</button>


        <button type="submit" value="mul" name="action">Addition (x)</button>


        <button type="submit" value="div" name="action">Addition (/)</button>

    </form>
  Result ${mess} : ${result}
  </body>
</html>
