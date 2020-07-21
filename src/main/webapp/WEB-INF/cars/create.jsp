<%--
  Created by IntelliJ IDEA.
  User: ramonipepperoni
  Date: 7/20/20
  Time: 6:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Create a car!" />
    </jsp:include>
</head>
<body>

    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <div class="container">
        <h1>Create a car here!</h1>
        <form action="/create" method="POST">
            <div class="form-group">
                <label for="make">Make</label>
                <input id="make" name="make" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="model">Model</label>
                <input id="model" name="model" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="year">Year</label>
                <input id="year" name="year" class="form-control" type="text">
            </div>
            <input type="submit" class="btn btn-primary btn-block" value="Log In">
        </form>
    </div>
</body>
</html>
