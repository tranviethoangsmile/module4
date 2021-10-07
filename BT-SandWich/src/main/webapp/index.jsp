<%--
  Created by IntelliJ IDEA.
  User: tvh-macbookpro
  Date: 07/10/2021
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h3>SandWich Comdiments with <span style="color: red">${comdiments}</span></h3>
      <form method="get" action="/comdiments">
        <input type="checkbox" name="comdiments" value="lettuce">Lettuce
        <input type="checkbox" name="comdiments" value="tomato">Tomato
        <input type="checkbox" name="comdiments" value="mustard">Mustard
        <input type="checkbox" name="comdiments" value="sprouts">Sprouts
        <input type="submit" value="Save">
      </form>
  </body>
</html>
