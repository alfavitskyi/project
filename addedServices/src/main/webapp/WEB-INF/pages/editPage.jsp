<%--
  Created by IntelliJ IDEA.
  User: alfav
  Date: 05/04/2020
  Time: 11:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty appartment.title}">
        <title>Add</title>
    </c:if>
    <c:if test="${empty appartment.title}">
        <title>Edit</title>
    </c:if>

</head>
<body>
<c:if test="${empty appartment.title}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${empty appartment.title}">
    <c:url value="/edit" var="var"/>
</c:if>

<form action="${var}" method="POST">
    <c:if test="${!empty appartment.title}">
        <input type="hidden" name="id" value="%{myAppartment.id}">
    </c:if>

    <label for="apartNum">Title</label>
    <input type="text" name="apartNum" id="apartNum">
    <label for="apartSquare">ApartSquare</label>
    <input type="text" name="apartSquare" id="apartSquare">
    <label for="debt">Debt</label>
    <input type="text" name="debt" id="debt">
    <label for="paySumm">PaySumm</label>
    <input type="text" name="paySumm" id="paySumm">
    <label for="apartEmail">ApartEmail</label>
    <input type="text" name="apartEmail" id="apartEmail">
    <label for="quantityPeople">QuantityPeople</label>
    <input type="text" name="quantityPeople" id="quantityPeople">
    <c:if test="${empty appartment.title}">
        <input type="submit" value="Add new appartment">
    </c:if>
    <c:if test="${!empty appartment.title}">
        <input type="submit" value="Edit appartment">
    </c:if>

</form>
</body>
</html>
