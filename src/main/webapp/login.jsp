<%--
  Created by IntelliJ IDEA.
  User: ramonipepperoni
  Date: 7/15/20
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%--<% request.setAttribute("username", ); %>--%>
<%--<% request.setAttribute("password", ); %>--%>
<%
    if(request.getMethod().)
%>
<html>
<head>
    <title>Login form!</title>
</head>
<body>
<%--FORM FOR LOGGING IN--%>
    <form action="/login.jsp" method="post">
        <label for="username" id="username">Enter Username:</label>
        <input type="text" placeholder="Enter username">
        <br>
        <label for="password" id="pass">Enter Password:</label>
        <input type="password" id="password">
        <button id="">submit</button>
    </form>

<%--LOGIC for Username to check if true--%>

        <c:if test="${username}">
        <%@ include file="profile.jsp" %>
        </c:if>


<%--LOGIC for password to check if true--%>
    <c:if test="${password == password}">
    </c:if>

</body>
</html>
