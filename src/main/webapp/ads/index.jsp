<%--
  Created by IntelliJ IDEA.
  User: ramonipepperoni
  Date: 7/16/20
  Time: 4:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Test for JSP AdLister</h1>

    <div class="ads">
        <c:forEach items="${allAds}" var="ad">
            <div class="ad">
                <p>${ad.title}</p>
                <p>${ad.description}</p>
            </div>
        </c:forEach>
    </div>



</body>
</html>
