
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<form action="search" method="get">
  <h1>Từ Điển</h1>
  <input type="text" name="search"> <br>
  <input type="submit" name="submit">
  <p>Result: ${search} </p>
</form>


</body>
</html>