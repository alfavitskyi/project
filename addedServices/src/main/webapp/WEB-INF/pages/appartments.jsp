<%--
  Created by IntelliJ IDEA.
  User: alfav
  Date: 28/03/2020
  Time: 11:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>ALLAppartments</title>
</head>
<body>

<h2>appartments</h2>
<table>
    <tr>
        <th>id</th>
        <th>apartNum</th>
        <th>apartSquare</th>
        <th>debt</th>
        <th>paySumm</th>
        <th>apartEmail</th>
        <th>quantityPeople</th>
    </tr>
    <c:forEach var="appartment" items="${apartmentList}">
        <tr>
        <td>${appartment.id}</td>
        <td>${appartment.apartNum}</td>
        <td>${appartment.apartSquare}</td>
        <td>${appartment.debt}</td>
        <td>${appartment.paySumm}</td>
        <td>${appartment.apartEmail}</td>
        <td>${appartment.quantityPeople}</td>
        <td>
        <a href="/edit/${appartment.id}">edit</a>
        <a href="/delete/${appartment.id}">delete</a>
        </td>
        </tr>
    </c:forEach>
</table>

<h2>Add</h2>

<a href="${add}">Add new appartment</a>

</body>
</html>
