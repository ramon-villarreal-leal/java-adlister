<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Car Ads"/>
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>

<div class="container">
    <h1>Here Are all the Car ads!</h1>
    <c:forEach items="${cars}" var="car">
        <div class="col-md-6">
            <p>Make: ${car.make}</p>
            <p>Model: ${car.model}</p>
            <p>Year: ${car.year}</p>
        </div>
    </c:forEach>

</div>

</body>
</html>