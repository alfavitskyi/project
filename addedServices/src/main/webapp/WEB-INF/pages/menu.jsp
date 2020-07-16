<%--
  Created by IntelliJ IDEA.
  User: Юля
  Date: 17.02.2020
  Time: 23:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    This is main menu
</body> ${myApartment}



    <h2><a href="/addQuantities">add Quantities</a></h2>
<h2><a href="/appartments">all appartments</a></h2>

<a href="/edit/${myAppartment.id}">edit</a>
</body>
</html>
