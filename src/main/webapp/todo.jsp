<%--
  Created by IntelliJ IDEA.
  User: ramonipepperoni
  Date: 7/14/20
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setAttribute("isAdmin", false); %>
<% request.setAttribute("myTasks", new String[]{"Todo 1", "Todo 2", "Todo 3"}); %>
<html>
<head>
    <title>To Do List</title>
</head>
<body>

<h1>Here are your To Do's:</h1>

    <c:choose>
        <c:when test="${isAdmin}">
            <p>You are viewing this as an admin</p>
            <%@ include file="partials/admin-nav.jsp"%>
        </c:when>
        <c:otherwise>
            <p>Move along now...</p>
            <%@ include file="partials/navbar.jsp"%>
        </c:otherwise>
    </c:choose>
    <h1>here are your to do's</h1>
    <ul>
        <c:forEach items="${myTasks}" var="task">
            <li>${task}</li>
        </c:forEach>
    </ul>
    <p><%= request.getParameter("item")%></p>
    <p><%= request.getMethod()%></p>

    <c:if test="${isAdmin}" >
        <p>super admin dashboard!</p>
    </c:if>
</body>
</html>
