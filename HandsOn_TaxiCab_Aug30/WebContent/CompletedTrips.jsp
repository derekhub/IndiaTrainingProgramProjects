<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Completed Trips</title>
</head>

<a href="index.jsp"> Index</a> <br>

<body>

<table>

<tr>
  <th>Trip ID</th>
  <th>Start Location</th>
  <th>End Location</th>
  <th>Vehicle Name</th>
  <th>Customer ID</th>
  <th>Fare Paid</th>
  <th>Status</th>
</tr>

<c:forEach items="${requestScope.CompletedTrips}" var="trip">
<tr>
  <td>${trip.tripId}</td>
  <td>${trip.startLocation}</td>
  <td>${trip.endLocation}</td>
  <td>${trip.vehicleName}</td>
  <td>${trip.customerId}</td>
  <td>${trip.farePaid}</td>
  <td>${trip.status}</td>
</tr>
</c:forEach>

</table>


</body>
</html>