<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="../resources/css/Style.css" type="text/css" rel="stylesheet" >
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<title>Show Customer Details</title>
</head>
<body>

${customerList }

<br><br><br><br>

<table class="tableStyle">
  <c:forEach items="${customerList }" var="cust">
    <spring:url value="/customer/${cust.customerNumber}" var="url"></spring:url>
    <tr>
      <td><a href="${url }" onclick="details()">${cust.customerNumber }</a></td>
      <td><c:out value = "${cust.customerName }"></c:out></td>
      <td><c:out value = "${cust.phoneNumber}"></c:out></td>
    </tr>
  </c:forEach>
</table>


</body>
</html>