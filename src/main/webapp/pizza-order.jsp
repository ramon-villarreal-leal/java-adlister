<%--
  Created by IntelliJ IDEA.
  User: ramonipepperoni
  Date: 7/15/20
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza order JSP</title>
</head>
<body>
    <h1>Choose your kind of pizza!</h1>
    <form action="display-order.jsp" method="POST">
        <h2>Pick your toppings: </h2>

        <select name="toppingPizza" id="pizza-select">
            <option value="toppings">=--Type of toppings do you want?--</option>
            <option value="Pepperoni">Pepperoni</option>
            <option value="Mushrooms">Mushrooms</option>
            <option value="Italian Sausage">Italian sausage</option>
        </select>


        <h2>Pick your crust: </h2>
    <%--    crust    --%>
        <select name="crustPizza" id="pizza-crust">
            <option value="">--Choose your crust--</option>
            <option value="Stuffed Crust">Stuffed Crust</option>
            <option value="Garlic">Garlic</option>
        </select>
        <label for="State">State</label><input type="text" name="State" id="State">
        <label for="City">City</label><input type="text" id="City" name="City">
        <label for="Street">Street address:</label><input type="text" id="Street" name="Street">
        <label for="Zipcode">Zipcode</label><input type="text" id="Zipcode" name="Zipcode">

        <button type="submit">Enjoy your pizza!</button>

    </form>

</body>
</html>
