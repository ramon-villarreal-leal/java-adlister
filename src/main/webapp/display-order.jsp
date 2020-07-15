<%--
  Created by IntelliJ IDEA.
  User: ramonipepperoni
  Date: 7/15/20
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza order page!</title>
</head>
<body>
    <h1>Your order below is:</h1>
    <p>The toppings you chose were ${param.toppingPizza}.</p>
    <p>The crust you chosen is ${param.crustPizza}</p>
    <p>Your address is:</p>
    <p>${param.Street}, ${param.City}, ${param.State} ${param.Zipcode}</p>

    <a href="/pizza-order.jsp">go back and make changes!</a>
</body>
</html>
