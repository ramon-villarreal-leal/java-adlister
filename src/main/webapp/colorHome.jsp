<%--
  Created by IntelliJ IDEA.
  User: ramonipepperoni
  Date: 7/15/20
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${param.color} Page</title>
</head>
<body style="background: ${param.color}">
    <p>Hey ${param.color} is my favorite color too!</p>
</body>
<a href="pickcolor.jsp">go back!</a>
</html>
