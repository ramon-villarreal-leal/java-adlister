<%--
  Created by IntelliJ IDEA.
  User: ramonipepperoni
  Date: 7/15/20
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Pick Color</title>
</head>
<body>
    <h2>Choose a color!</h2>
    <form action="colorHome.jsp" method="pos">
        <label for="red">Red</label><input type="radio" id="red" name="color" value="red"><br>
        <label for="blue">Blue</label><input type="radio" id="blue" name="color" value="blue"><br>
        <label for="green">Green</label><input type="radio" id="green" name="color" value="green"><br>
        <button type="submit">submit</button>
    </form>
</body>
</html>
