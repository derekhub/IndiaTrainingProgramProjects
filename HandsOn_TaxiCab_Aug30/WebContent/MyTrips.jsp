<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Trips</title>
</head>

<a href="index.jsp"> Index</a> <br><br>

<body>

<form action="ScheduledTripsServlet" method="post">
  <input type="submit" value="Scheduled Trips">
</form>

<form action="CompletedTripsServlet" method="post">
  <input type="submit" value="Completed Trips">
</form>

<form action="CancelledTripsServlet" method="post">
  <input type="submit" value="Cancelled Trips">
</form>

<br>

<form action="SpecialOffersServlet" method="post">
  <input type="submit" value="Special Offers">
</form>

</body>
</html>