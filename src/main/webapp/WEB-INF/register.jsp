<%--
  Created by IntelliJ IDEA.
  User: ramonipepperoni
  Date: 7/22/20
  Time: 6:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<div class="container">
    <h1>Sign up as a new User!</h1>
    <form action="/register" method="POST">
        <div class="form-group">
            <label for="username">Register your Username: </label>
            <input id="username" name="username" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="password">Register your password: </label>
            <input id="password" name="password" class="form-control" type="password">
        </div>
        <div class="form-group">
            <label for="email">Register your email: </label>
            <input id="email" name="email" class="form-control" type="email">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Register new User">
    </form>
</div>
</body>
</html>
